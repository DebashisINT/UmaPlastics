package com.umaplasticsfsm.features.stockAddCurrentStock.api

import com.umaplasticsfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.umaplasticsfsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}