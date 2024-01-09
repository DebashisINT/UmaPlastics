package com.umaplasticsfsm.features.weather.api

import com.umaplasticsfsm.features.task.api.TaskApi
import com.umaplasticsfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}