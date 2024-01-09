package com.umaplasticsfsm.features.photoReg.adapter

import com.umaplasticsfsm.features.photoReg.model.ProsCustom
import com.umaplasticsfsm.features.photoReg.model.UserListResponseModel

interface ProsListSelectionListner {
    fun getInfo(obj: ProsCustom)
}