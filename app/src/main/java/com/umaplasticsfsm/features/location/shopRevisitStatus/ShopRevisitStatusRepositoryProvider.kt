package com.umaplasticsfsm.features.location.shopRevisitStatus

import com.umaplasticsfsm.features.location.shopdurationapi.ShopDurationApi
import com.umaplasticsfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}