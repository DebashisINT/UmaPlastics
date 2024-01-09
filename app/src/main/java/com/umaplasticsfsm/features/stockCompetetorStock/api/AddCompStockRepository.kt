package com.umaplasticsfsm.features.stockCompetetorStock.api

import com.umaplasticsfsm.base.BaseResponse
import com.umaplasticsfsm.features.orderList.model.NewOrderListResponseModel
import com.umaplasticsfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.umaplasticsfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}