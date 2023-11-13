package lesson_12

fun main() {
    WeatherAtNoon(305, 297, false)
}

class WeatherAtNoon(temperatureInKelvinsDay: Int, temperatureInKelvinsNight: Int, rain: Boolean) {
    val daytimeTemperature = temperatureInKelvinsDay - TEMPERATURE_KELVINS
    val nightTemperature = temperatureInKelvinsNight - TEMPERATURE_KELVINS
    val precipitation = rain
    init {
        println("Погода:\nТемпература днем: ${daytimeTemperature}\nТемпература ночью: ${nightTemperature}\nОсадки: $precipitation")
    }
}

const val TEMPERATURE_KELVINS = 273