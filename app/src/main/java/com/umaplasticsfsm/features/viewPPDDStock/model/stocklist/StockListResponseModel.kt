package com.umaplasticsfsm.features.viewPPDDStock.model.stocklist

import com.umaplasticsfsm.base.BaseResponse

/**
 * Created by Saikat on 13-11-2018.
 */
class StockListResponseModel : BaseResponse() {
    var stock_list: ArrayList<StockListDataModel>? = null
}