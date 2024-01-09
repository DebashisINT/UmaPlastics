package com.umaplasticsfsm.features.viewAllOrder.interf

import com.umaplasticsfsm.app.domain.NewOrderProductEntity
import com.umaplasticsfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}