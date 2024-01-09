package com.umaplasticsfsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.umaplasticsfsm.app.FileUtils
import com.umaplasticsfsm.base.BaseResponse
import com.umaplasticsfsm.features.NewQuotation.model.*
import com.umaplasticsfsm.features.addshop.model.AddShopRequestData
import com.umaplasticsfsm.features.addshop.model.AddShopResponse
import com.umaplasticsfsm.features.damageProduct.model.DamageProductResponseModel
import com.umaplasticsfsm.features.damageProduct.model.delBreakageReq
import com.umaplasticsfsm.features.damageProduct.model.viewAllBreakageReq
import com.umaplasticsfsm.features.login.model.userconfig.UserConfigResponseModel
import com.umaplasticsfsm.features.myjobs.model.WIPImageSubmit
import com.umaplasticsfsm.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}