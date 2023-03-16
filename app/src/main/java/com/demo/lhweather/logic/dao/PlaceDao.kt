package com.demo.lhweather.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.demo.lhweather.LHWeatherApplication
import com.demo.lhweather.logic.model.Place
import com.google.gson.Gson

object PlaceDao {

    private fun sharedPreferences() = LHWeatherApplication.context.getSharedPreferences("weather", Context.MODE_PRIVATE)

    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")
}