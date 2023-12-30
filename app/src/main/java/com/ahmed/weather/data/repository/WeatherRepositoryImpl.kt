package com.ahmed.weather.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import com.ahmed.weather.data.remote.WeatherApi
import com.ahmed.weather.data.remote.WeatherDto
import com.ahmed.weather.domain.repository.WeatherRepository
import com.ahmed.weather.domain.util.Resource
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
) : WeatherRepository {

    @RequiresApi(Build.VERSION_CODES.O)
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherDto> {
        return try {
            Resource.Success(
                data = api.getWeather(
                    location = "$lat,$long",
                )
            )
        } catch (e: Exception) {
            return Resource.Error(e.message ?: "Unknown Error")
        }
    }
}