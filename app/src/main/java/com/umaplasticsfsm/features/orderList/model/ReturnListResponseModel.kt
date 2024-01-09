package com.umaplasticsfsm.features.orderList.model

import com.umaplasticsfsm.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}