package com.ahmed.weather.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("v1/forecast.json?key=3fc1a8a00c17456193395703232812&days=5")
    suspend fun getWeather(
        @Query("q") location: String,
    ): WeatherDto
}