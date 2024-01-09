package com.umaplasticsfsm.features.viewAllOrder.interf

import com.umaplasticsfsm.app.domain.NewOrderGenderEntity
import com.umaplasticsfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}