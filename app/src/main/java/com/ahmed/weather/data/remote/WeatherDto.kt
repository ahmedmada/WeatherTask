package com.ahmed.weather.data.remote

import com.squareup.moshi.Json

data class WeatherDto(

    @field:Json(name = "location")
    val location: Location,
    @field:Json(name = "current")
    val current: Current,
    @field:Json(name = "forecast")
    val forecast: Forecast,

    )