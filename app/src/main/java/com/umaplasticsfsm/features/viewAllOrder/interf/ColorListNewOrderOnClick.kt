package com.umaplasticsfsm.features.viewAllOrder.interf

import com.umaplasticsfsm.app.domain.NewOrderColorEntity
import com.umaplasticsfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}