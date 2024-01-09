package com.umaplasticsfsm.features.photoReg.present

import com.umaplasticsfsm.app.domain.ProspectEntity
import com.umaplasticsfsm.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}