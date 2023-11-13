package lesson_12

fun main() {
    val weatherInCelsius = WeatherAtNoon(305, 297, false)
    println("Погода:\nТемпература днем: ${weatherInCelsius.daytimeTemperature}\nТемпература ночью: ${weatherInCelsius.nightTemperature}\nОсадки: ${weatherInCelsius.precipitation}")
}

class WeatherAtNoon(temperatureInKelvinsDay: Int, temperatureInKelvinsNight: Int, rain: Boolean) {
    val daytimeTemperature = temperatureInKelvinsDay - TEMPERATURE_KELVINS
    val nightTemperature = temperatureInKelvinsNight - TEMPERATURE_KELVINS
    val precipitation = rain
}

const val TEMPERATURE_KELVINS = 273