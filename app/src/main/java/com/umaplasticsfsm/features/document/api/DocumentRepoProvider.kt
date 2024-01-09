package com.umaplasticsfsm.features.document.api

import com.umaplasticsfsm.features.dymanicSection.api.DynamicApi
import com.umaplasticsfsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}