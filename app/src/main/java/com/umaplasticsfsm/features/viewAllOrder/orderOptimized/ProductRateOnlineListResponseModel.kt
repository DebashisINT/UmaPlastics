package com.umaplasticsfsm.features.viewAllOrder.orderOptimized

import com.umaplasticsfsm.app.domain.ProductOnlineRateTempEntity
import com.umaplasticsfsm.base.BaseResponse
import com.umaplasticsfsm.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}