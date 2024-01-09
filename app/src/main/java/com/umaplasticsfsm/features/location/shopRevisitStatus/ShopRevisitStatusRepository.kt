package com.umaplasticsfsm.features.location.shopRevisitStatus

import com.umaplasticsfsm.base.BaseResponse
import com.umaplasticsfsm.features.location.model.ShopDurationRequest
import com.umaplasticsfsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}