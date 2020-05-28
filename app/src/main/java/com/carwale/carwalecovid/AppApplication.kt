package com.carwale.carwalecovid

import android.app.Application
import android.content.Context
import com.carwale.carwalecovid.services.ApiClient

class AppApplication : Application() {
    companion object {

        lateinit var appContext: Context
        fun getApiClient(): ApiClient {
            return ApiClient()
        }

    }

    override fun onCreate() {
        super.onCreate()

        appContext = applicationContext
        getApiClient()
    }

}