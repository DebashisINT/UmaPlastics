package com.umaplasticsfsm.features.viewAllOrder.interf

import com.umaplasticsfsm.app.domain.NewOrderGenderEntity
import com.umaplasticsfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}