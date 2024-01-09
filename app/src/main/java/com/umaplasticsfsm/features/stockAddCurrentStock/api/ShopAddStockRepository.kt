package com.umaplasticsfsm.features.stockAddCurrentStock.api

import com.umaplasticsfsm.base.BaseResponse
import com.umaplasticsfsm.features.location.model.ShopRevisitStatusRequest
import com.umaplasticsfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.umaplasticsfsm.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.umaplasticsfsm.features.stockAddCurrentStock.model.CurrentStockGetData
import com.umaplasticsfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}