package com.umaplasticsfsm.features.login.model.productlistmodel

import com.umaplasticsfsm.app.domain.ModelEntity
import com.umaplasticsfsm.app.domain.ProductListEntity
import com.umaplasticsfsm.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}