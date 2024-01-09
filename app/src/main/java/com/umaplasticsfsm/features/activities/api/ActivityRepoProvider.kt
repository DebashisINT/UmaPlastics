package com.umaplasticsfsm.features.activities.api

import com.umaplasticsfsm.features.member.api.TeamApi
import com.umaplasticsfsm.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}