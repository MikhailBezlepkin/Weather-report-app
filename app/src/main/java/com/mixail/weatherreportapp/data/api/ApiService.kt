package com.mixail.weatherreportapp.data.api

import com.mixail.weatherreportapp.model.Weather
import com.mixail.weatherreportapp.model.WeatherModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("v1/current.json?key=57a77ad8d1e947128d1173005230802&aqi=no")
    suspend fun getWeather(
        @Query("q") query: String,
    ): Response<Weather>
}