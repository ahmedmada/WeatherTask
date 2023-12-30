package com.ahmed.weather.data.remote

import com.squareup.moshi.Json

data class Current(
    @field:Json(name = "last_updated_epoch") val lastUpdatedEpoch: Long,

    @field:Json(name = "last_updated") val lastUpdated: String,

    @field:Json(name = "temp_c") val tempC: Double,

    @field:Json(name = "temp_f") val tempF: Double,

    @field:Json(name = "is_day") val isDay: Long,

    val condition: Condition,

    @field:Json(name = "wind_mph") val windMph: Double,

    @field:Json(name = "wind_kph") val windKph: Double,

    @field:Json(name = "wind_degree") val windDegree: Long,

    @field:Json(name = "wind_dir") val windDir: String,

    @field:Json(name = "pressure_mb") val pressureMB: Double,

    @field:Json(name = "pressure_in") val pressureIn: Double,

    @field:Json(name = "precip_mm") val precipMm: Double,

    @field:Json(name = "precip_in") val precipIn: Double,

    val humidity: Long, val cloud: Long,

    @field:Json(name = "feelslike_c") val feelslikeC: Double,

    @field:Json(name = "feelslike_f") val feelslikeF: Double,

    @field:Json(name = "vis_km") val visKM: Double,

    @field:Json(name = "vis_miles") val visMiles: Double,

    val uv: Double,

    @field:Json(name = "gust_mph") val gustMph: Double,

    @field:Json(name = "gust_kph") val gustKph: Double
)

data class Condition(
    val text: String, val icon: String, val code: Long
)

data class Forecast(
    val forecastday: List<Forecastday>
)

data class Forecastday(
    val date: String,

    @field:Json(name = "date_epoch") val dateEpoch: Long,

    val day: Day, val astro: Astro, val hour: List<Hour>
)

data class Astro(
    val sunrise: String, val sunset: String, val moonrise: String, val moonset: String,

    @field:Json(name = "moon_phase") val moonPhase: String,

    @field:Json(name = "moon_illumination") val moonIllumination: Long,

    @field:Json(name = "is_moon_up") val isMoonUp: Long,

    @field:Json(name = "is_sun_up") val isSunUp: Long
)

data class Day(
    @field:Json(name = "maxtemp_c") val maxtempC: Double,

    @field:Json(name = "maxtemp_f") val maxtempF: Double,

    @field:Json(name = "mintemp_c") val mintempC: Double,

    @field:Json(name = "mintemp_f") val mintempF: Double,

    @field:Json(name = "avgtemp_c") val avgtempC: Double,

    @field:Json(name = "avgtemp_f") val avgtempF: Double,

    @field:Json(name = "maxwind_mph") val maxwindMph: Double,

    @field:Json(name = "maxwind_kph") val maxwindKph: Double,

    @field:Json(name = "totalprecip_mm") val totalprecipMm: Double,

    @field:Json(name = "totalprecip_in") val totalprecipIn: Double,

    @field:Json(name = "totalsnow_cm") val totalsnowCM: Double,

    @field:Json(name = "avgvis_km") val avgvisKM: Double,

    @field:Json(name = "avgvis_miles") val avgvisMiles: Double,

    val avghumidity: Double,

    @field:Json(name = "daily_will_it_rain") val dailyWillItRain: Long,

    @field:Json(name = "daily_chance_of_rain") val dailyChanceOfRain: Long,

    @field:Json(name = "daily_will_it_snow") val dailyWillItSnow: Long,

    @field:Json(name = "daily_chance_of_snow") val dailyChanceOfSnow: Long,

    val condition: Condition, val uv: Double
)

data class Hour(
    @field:Json(name = "time_epoch") val timeEpoch: Long,

    val time: String,

    @field:Json(name = "temp_c") val tempC: Double,

    @field:Json(name = "temp_f") val tempF: Double,

    @field:Json(name = "is_day") val isDay: Long,

    val condition: Condition,

    @field:Json(name = "wind_mph") val windMph: Double,

    @field:Json(name = "wind_kph") val windKph: Double,

    @field:Json(name = "wind_degree") val windDegree: Long,

    @field:Json(name = "wind_dir") val windDir: String,

    @field:Json(name = "pressure_mb") val pressureMB: Double,

    @field:Json(name = "pressure_in") val pressureIn: Double,

    @field:Json(name = "precip_mm") val precipMm: Double,

    @field:Json(name = "precip_in") val precipIn: Double,

    @field:Json(name = "snow_cm") val snowCM: Double,

    val humidity: Long, val cloud: Long,

    @field:Json(name = "feelslike_c") val feelslikeC: Double,

    @field:Json(name = "feelslike_f") val feelslikeF: Double,

    @field:Json(name = "windchill_c") val windchillC: Double,

    @field:Json(name = "windchill_f") val windchillF: Double,

    @field:Json(name = "heatindex_c") val heatindexC: Double,

    @field:Json(name = "heatindex_f") val heatindexF: Double,

    @field:Json(name = "dewpoint_c") val dewpointC: Double,

    @field:Json(name = "dewpoint_f") val dewpointF: Double,

    @field:Json(name = "will_it_rain") val willItRain: Long,

    @field:Json(name = "chance_of_rain") val chanceOfRain: Long,

    @field:Json(name = "will_it_snow") val willItSnow: Long,

    @field:Json(name = "chance_of_snow") val chanceOfSnow: Long,

    @field:Json(name = "vis_km") val visKM: Double,

    @field:Json(name = "vis_miles") val visMiles: Double,

    @field:Json(name = "gust_mph") val gustMph: Double,

    @field:Json(name = "gust_kph") val gustKph: Double,

    val uv: Double
)

data class Location(
    val name: String, val region: String, val country: String, val lat: Double, val lon: Double,

    @field:Json(name = "tz_id") val tzID: String,

    @field:Json(name = "localtime_epoch") val localtimeEpoch: Long,

    val localtime: String
)
