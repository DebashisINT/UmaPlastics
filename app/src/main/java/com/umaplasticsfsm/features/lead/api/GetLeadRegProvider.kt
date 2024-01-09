package com.umaplasticsfsm.features.lead.api

import com.umaplasticsfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.umaplasticsfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}