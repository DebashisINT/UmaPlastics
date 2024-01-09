package com.umaplasticsfsm.features.addAttendence.api.routeapi

import com.umaplasticsfsm.app.Pref
import com.umaplasticsfsm.features.addAttendence.model.AreaListResponse
import com.umaplasticsfsm.features.addAttendence.model.DistanceResponseModel
import com.umaplasticsfsm.features.addAttendence.model.LocationListResponseModel
import com.umaplasticsfsm.features.addAttendence.model.RouteResponseModel
import com.umaplasticsfsm.features.addAttendence.model.VisitLocationListResponse
import io.reactivex.Observable

/**
 * Created by Saikat on 22-11-2018.
 */
class RouteRepo(val apiService: RouteApi) {
    fun getRouteList(): Observable<RouteResponseModel> {
        return apiService.getRouteList(Pref.session_token!!, Pref.user_id!!)
    }

    fun getLocList(): Observable<LocationListResponseModel> {
        return apiService.getLocationList(Pref.session_token!!, Pref.user_id!!)
    }

    fun getAreaList(): Observable<AreaListResponse> {
        return apiService.getAreaList(Pref.session_token!!, Pref.user_id!!,Pref.profile_city!!)
    }

    fun getVisitLocationList(): Observable<VisitLocationListResponse> {
        return apiService.getVisitLocationList(Pref.session_token!!)
    }

    fun getDistance(from_id: String, to_id: String): Observable<DistanceResponseModel> {
        return apiService.getDistance(Pref.session_token!!, Pref.user_id!!, from_id, to_id)
    }
}