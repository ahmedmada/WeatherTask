package com.ahmed.weather.domain.weather

import androidx.annotation.DrawableRes
import com.ahmed.weather.R

sealed class WeatherType(
    val weatherDesc: String,
    @DrawableRes val iconRes: Int
) {
    object ClearSky : WeatherType(
        weatherDesc = "Clear sky",
        iconRes = R.drawable.ic_sunny
    )

    object MainlyClear : WeatherType(
        weatherDesc = "Mainly clear",
        iconRes = R.drawable.ic_cloudy
    )

    object PartlyCloudy : WeatherType(
        weatherDesc = "Partly cloudy",
        iconRes = R.drawable.ic_cloudy
    )

    object Overcast : WeatherType(
        weatherDesc = "Overcast",
        iconRes = R.drawable.ic_cloudy
    )

    object Foggy : WeatherType(
        weatherDesc = "Foggy",
        iconRes = R.drawable.ic_very_cloudy
    )

    object DepositingRimeFog : WeatherType(
        weatherDesc = "Depositing rime fog",
        iconRes = R.drawable.ic_very_cloudy
    )

    object LightDrizzle : WeatherType(
        weatherDesc = "Light drizzle",
        iconRes = R.drawable.ic_rainshower
    )

    object ModerateDrizzle : WeatherType(
        weatherDesc = "Moderate drizzle",
        iconRes = R.drawable.ic_rainshower
    )

    object DenseDrizzle : WeatherType(
        weatherDesc = "Dense drizzle",
        iconRes = R.drawable.ic_rainshower
    )

    object LightFreezingDrizzle : WeatherType(
        weatherDesc = "Slight freezing drizzle",
        iconRes = R.drawable.ic_snowyrainy
    )

    object DenseFreezingDrizzle : WeatherType(
        weatherDesc = "Dense freezing drizzle",
        iconRes = R.drawable.ic_snowyrainy
    )

    object SlightRain : WeatherType(
        weatherDesc = "Slight rain",
        iconRes = R.drawable.ic_rainy
    )

    object ModerateRain : WeatherType(
        weatherDesc = "Rainy",
        iconRes = R.drawable.ic_rainy
    )

    object HeavyRain : WeatherType(
        weatherDesc = "Heavy rain",
        iconRes = R.drawable.ic_rainy
    )

    object HeavyFreezingRain : WeatherType(
        weatherDesc = "Heavy freezing rain",
        iconRes = R.drawable.ic_snowyrainy
    )

    object SlightSnowFall : WeatherType(
        weatherDesc = "Slight snow fall",
        iconRes = R.drawable.ic_snowy
    )

    object ModerateSnowFall : WeatherType(
        weatherDesc = "Moderate snow fall",
        iconRes = R.drawable.ic_heavysnow
    )

    object HeavySnowFall : WeatherType(
        weatherDesc = "Heavy snow fall",
        iconRes = R.drawable.ic_heavysnow
    )

    object SnowGrains : WeatherType(
        weatherDesc = "Snow grains",
        iconRes = R.drawable.ic_heavysnow
    )

    object SlightRainShowers : WeatherType(
        weatherDesc = "Slight rain showers",
        iconRes = R.drawable.ic_rainshower
    )

    object ModerateRainShowers : WeatherType(
        weatherDesc = "Moderate rain showers",
        iconRes = R.drawable.ic_rainshower
    )

    object ViolentRainShowers : WeatherType(
        weatherDesc = "Violent rain showers",
        iconRes = R.drawable.ic_rainshower
    )

    object SlightSnowShowers : WeatherType(
        weatherDesc = "Light snow showers",
        iconRes = R.drawable.ic_snowy
    )

    object HeavySnowShowers : WeatherType(
        weatherDesc = "Heavy snow showers",
        iconRes = R.drawable.ic_snowy
    )

    companion object {
        fun fromWMO(code: Int): WeatherType {
            return when (code) {
                1000 -> ClearSky
                1006 -> MainlyClear
                1003 -> PartlyCloudy
                1009 -> Overcast
                1135 -> Foggy
                1147 -> DepositingRimeFog
                1153 -> LightDrizzle
                1150 -> ModerateDrizzle
                1171 -> DenseDrizzle
                1072 -> LightFreezingDrizzle
                1063 -> SlightRain
                1240 -> SlightRain
                1249 -> SlightRain
                1180 -> ModerateRain
                1273 -> ModerateRain
                1192 -> HeavyRain
                1243 -> HeavyRain
                1246 -> HeavyRain
                1276 -> HeavyRain
                1168 -> LightFreezingDrizzle
                1195 -> HeavyFreezingRain
                1198 -> HeavyFreezingRain
                1261 -> HeavyFreezingRain
                1264 -> HeavyFreezingRain
                1213 -> SlightSnowFall
                1210 -> ModerateSnowFall
                1114 -> HeavySnowFall
                1066 -> SnowGrains
                1219 -> SnowGrains
                1279 -> SnowGrains
                1183 -> SlightRainShowers
                1255 -> SlightRainShowers
                1186 -> ModerateRainShowers
                1201 -> ModerateRainShowers
                1189 -> ViolentRainShowers
                1252 -> ViolentRainShowers
                1258 -> ViolentRainShowers
                1216 -> SlightSnowShowers
                1222 -> HeavySnowShowers
                1225 -> HeavySnowShowers
                1237 -> HeavySnowShowers
                1282 -> HeavySnowShowers
                else -> ClearSky
            }
        }
    }
}