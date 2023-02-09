package com.mixail.weatherreportapp.data.repository

import com.mixail.weatherreportapp.data.api.RetrofitInstance
import com.mixail.weatherreportapp.model.Weather
import retrofit2.Response

class Repository {
    suspend fun getWeather(q: String): Response<Weather> {
        return RetrofitInstance.api.getWeather(q)
    }
}