package com.umaplasticsfsm.features.dashboard.presentation.api.dayStartEnd

import com.umaplasticsfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.umaplasticsfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}