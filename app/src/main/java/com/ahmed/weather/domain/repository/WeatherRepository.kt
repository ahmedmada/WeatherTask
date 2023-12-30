package com.ahmed.weather.domain.repository

import com.ahmed.weather.data.remote.WeatherDto
import com.ahmed.weather.domain.util.Resource
import com.ahmed.weather.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherDto>
}