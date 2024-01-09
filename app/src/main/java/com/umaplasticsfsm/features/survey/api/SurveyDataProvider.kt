package com.umaplasticsfsm.features.survey.api

import com.umaplasticsfsm.features.photoReg.api.GetUserListPhotoRegApi
import com.umaplasticsfsm.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}