package lesson_12

fun main() {
    val weatherInCelsius = WeatherToday(305, 297, false)
    weatherInCelsius.daytimeTemperature
    weatherInCelsius.nightTemperature
    weatherInCelsius.precipitation = false

    weatherInCelsius.dataOutput()
}

class WeatherToday(temperatureInKelvinsDay: Int, temperatureInKelvinsNight: Int, rain: Boolean) {
    val temperatureInKelvinsDay = 305
    val temperatureInKelvinsNight = 297
    val daytimeTemperature = temperatureInKelvinsDay - TEMPERATURE_IN_KELVINS
    val nightTemperature = temperatureInKelvinsNight - TEMPERATURE_IN_KELVINS
    var precipitation = rain

    fun dataOutput() {
        println("Погода:\nТемпература днем: $daytimeTemperature\nТемпература ночью: $nightTemperature\nОсадки: $precipitation")
    }
}

const val TEMPERATURE_IN_KELVINS = 273