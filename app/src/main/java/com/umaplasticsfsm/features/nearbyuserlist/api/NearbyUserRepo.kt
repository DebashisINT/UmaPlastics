package com.umaplasticsfsm.features.nearbyuserlist.api

import com.umaplasticsfsm.app.Pref
import com.umaplasticsfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.umaplasticsfsm.features.newcollection.model.NewCollectionListResponseModel
import com.umaplasticsfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}