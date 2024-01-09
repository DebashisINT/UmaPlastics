package com.umaplasticsfsm.features.contacts

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.NumberPicker
import android.widget.TextView
import com.umaplasticsfsm.R
import com.umaplasticsfsm.app.AppDatabase
import com.umaplasticsfsm.app.domain.ScheduleTemplateEntity
import com.umaplasticsfsm.app.domain.TypeMasterEntity
import com.umaplasticsfsm.app.utils.AppUtils
import com.umaplasticsfsm.app.utils.Toaster
import com.umaplasticsfsm.base.presentation.BaseFragment
import com.umaplasticsfsm.features.dashboard.presentation.DashboardActivity
import com.prolificinteractive.materialcalendarview.CalendarDay
import com.prolificinteractive.materialcalendarview.MaterialCalendarView
import java.text.SimpleDateFormat
import java.util.Calendar


class SchedulerAddFormFrag : BaseFragment(), View.OnClickListener {
    private lateinit var mContext: Context

    private lateinit var hour_numPicker:NumberPicker
    private lateinit var min_numPicker:NumberPicker
    private lateinit var tv_selectedTime:TextView
    private lateinit var calendarView : MaterialCalendarView

    private lateinit var ll_template : LinearLayout

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }
    companion object{
        fun getInstance(objects: Any): SchedulerAddFormFrag {
            val objFragment = SchedulerAddFormFrag()
            var obj = objects as String
            return objFragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_scheduler_add_form, container, false)
        initView(view)
        return view
    }

    private fun initView(view: View) {
        hour_numPicker = view.findViewById(R.id.np_frag_schedule_add_form_hr)
        min_numPicker = view.findViewById(R.id.np_frag_schedule_add_form_min)
        tv_selectedTime = view.findViewById(R.id.tv_frag_schedule_add_form_selected_time)
        calendarView = view.findViewById(R.id.calendarView_frag_schedule_calendar)

        ll_template = view.findViewById(R.id.ll_frag_sched_add_form_template_dropDown)


        ll_template.setOnClickListener(this)

        setCal()
        setTestData()
    }

    private fun setCal(){
        calendarView.setSelectionMode(MaterialCalendarView.SELECTION_MODE_MULTIPLE)

        /*val currentDate = AppUtils.getCurrentDateChanged()
        var y = currentDate.split("-").get(2).toInt()
        var m = currentDate.split("-").get(1).toInt()
        var d = currentDate.split("-").get(0).toInt()*/

        calendarView.state().edit()
            .setMinimumDate(CalendarDay.today())
            //.setMaximumDate(CalendarDay.today())
            .commit()

        hour_numPicker.minValue = 1
        hour_numPicker.maxValue = 23
        min_numPicker.minValue = 1
        min_numPicker.maxValue = 59

        var hrL = Array<String>(23) { "" }
        for(i in 0..22){
            hrL[i] = "${i+1} h"
        }
        var minL = Array<String>(59) { "" }
        for(i in 0..58){
            minL[i] = "${i+1} min"
        }

        hour_numPicker.displayedValues =hrL
        min_numPicker.displayedValues =minL

        var selectedHr = "1 h"
        var selectedMin = "1 min"

        hour_numPicker.setOnValueChangedListener(object : NumberPicker.OnValueChangeListener {
            override fun onValueChange(numberPicker: NumberPicker, i: Int, i2: Int) {
                try{
                    selectedHr = hrL[i2-1].toString()
                    tv_selectedTime.text = selectedHr+" "+ selectedMin
                }catch (ex:Exception){
                    ex.printStackTrace()
                    println("tag_picker_err ${ex.message}")
                }
            }
        })

        min_numPicker.setOnValueChangedListener(object : NumberPicker.OnValueChangeListener {
            override fun onValueChange(numberPicker: NumberPicker, i: Int, i2: Int) {
                try{
                    selectedMin = minL[i2-1].toString()
                    tv_selectedTime.text =selectedHr+" "+ selectedMin
                }catch (ex:Exception){
                    ex.printStackTrace()
                    println("tag_picker_err ${ex.message}")
                }
                var t = calendarView.selectedDates
                var a = "as"
            }
        })

    }

    private fun setTemplateData(){
        var templateList =  AppDatabase.getDBInstance()?.scheduleTemplateDao()?.getAll() as ArrayList<ScheduleTemplateEntity>
        if(templateList.size>0){
            var genericL : ArrayList<CustomData> = ArrayList()
            for(i in 0..templateList.size-1){
                genericL.add(CustomData(templateList.get(i).template_id.toString(),templateList.get(i).template_name.toString()))
            }
            GenericDialog.newInstance("Template",genericL as ArrayList<CustomData>){

            }.show((mContext as DashboardActivity).supportFragmentManager, "")
        }else{
            Toaster.msgShort(mContext, "No Template Found")
        }
    }

    private fun setTestData(){
        var obj = ScheduleTemplateEntity()
        obj.template_id = 1
        obj.template_name = "template 1"

        var obj1 = ScheduleTemplateEntity()
        obj1.template_id = 2
        obj1.template_name = "template 2"

        AppDatabase.getDBInstance()?.scheduleTemplateDao()?.insert(obj)
        AppDatabase.getDBInstance()?.scheduleTemplateDao()?.insert(obj1)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.ll_frag_sched_add_form_template_dropDown ->{
                Handler().postDelayed(Runnable {
                    setTemplateData()
                }, 100)
            }
        }
    }
}