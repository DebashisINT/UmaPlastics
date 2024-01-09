package com.umaplasticsfsm.features.location.api

import com.umaplasticsfsm.features.location.shopdurationapi.ShopDurationApi
import com.umaplasticsfsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}