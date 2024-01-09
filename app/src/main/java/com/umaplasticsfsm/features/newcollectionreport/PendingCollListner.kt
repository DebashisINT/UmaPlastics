package com.umaplasticsfsm.features.newcollectionreport

import com.umaplasticsfsm.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}