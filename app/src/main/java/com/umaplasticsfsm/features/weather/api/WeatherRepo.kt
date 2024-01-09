package com.umaplasticsfsm.features.weather.api

import com.umaplasticsfsm.base.BaseResponse
import com.umaplasticsfsm.features.task.api.TaskApi
import com.umaplasticsfsm.features.task.model.AddTaskInputModel
import com.umaplasticsfsm.features.weather.model.ForeCastAPIResponse
import com.umaplasticsfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}