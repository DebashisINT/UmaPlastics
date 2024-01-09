package com.umaplasticsfsm.features.viewAllOrder.interf

import com.umaplasticsfsm.app.domain.NewOrderGenderEntity
import com.umaplasticsfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}