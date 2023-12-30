package com.ahmed.weather.presentation

import com.ahmed.weather.data.remote.WeatherDto

data class WeatherState(
    val weatherInfo: WeatherDto? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
