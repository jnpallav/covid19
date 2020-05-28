package com.carwale.carwalecovid.services.repository

import com.carwale.carwalecovid.AppApplication
import com.carwale.carwalecovid.model.Summary
import io.reactivex.Single

class SummaryRepository {

    fun getCovidSummary(): Single<Summary> {
        return AppApplication.getApiClient().getRestInterface().getSummary()
    }

}