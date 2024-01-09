package com.umaplasticsfsm.features.newcollection.model

import com.umaplasticsfsm.app.domain.CollectionDetailsEntity
import com.umaplasticsfsm.base.BaseResponse
import com.umaplasticsfsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}