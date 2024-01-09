package com.umaplasticsfsm.features.viewAllOrder.model

import com.umaplasticsfsm.app.domain.NewOrderColorEntity
import com.umaplasticsfsm.app.domain.NewOrderGenderEntity
import com.umaplasticsfsm.app.domain.NewOrderProductEntity
import com.umaplasticsfsm.app.domain.NewOrderSizeEntity
import com.umaplasticsfsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

