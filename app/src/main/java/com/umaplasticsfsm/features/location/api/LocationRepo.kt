package com.umaplasticsfsm.features.location.api

import com.umaplasticsfsm.app.Pref
import com.umaplasticsfsm.base.BaseResponse
import com.umaplasticsfsm.features.location.model.AppInfoInputModel
import com.umaplasticsfsm.features.location.model.AppInfoResponseModel
import com.umaplasticsfsm.features.location.model.GpsNetInputModel
import com.umaplasticsfsm.features.location.model.ShopDurationRequest
import com.umaplasticsfsm.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }

    fun gpsNetInfo(appInfo: GpsNetInputModel?): Observable<BaseResponse> {
        return apiService.submitGpsNetInfo(appInfo)
    }
}