package com.demo.lhweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class LHWeatherApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "EzTcgU7y3Z5wATvy"
    }
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}