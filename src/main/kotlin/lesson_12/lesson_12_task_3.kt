package lesson_12

fun main() {
    val weatherInCelsius = WeatherToday(305, 297, false)
    weatherInCelsius.daytimeTemperature = weatherInCelsius.daytimeTemperature - TEMPERATURE_IN_KELVINS
    weatherInCelsius.nightTemperature = weatherInCelsius.nightTemperature - TEMPERATURE_IN_KELVINS
    weatherInCelsius.precipitation = false

    weatherInCelsius.dataOutput()
}

class WeatherToday(kelvinDay: Int, kelvinNight: Int, rain: Boolean) {
    var daytimeTemperature = kelvinDay
    var nightTemperature = kelvinNight
    var precipitation = rain

    fun dataOutput() {
        println("Погода:\nТемпература днем: $daytimeTemperature\nТемпература ночью: $nightTemperature\nОсадки: $precipitation")
    }
}

const val TEMPERATURE_IN_KELVINS = 273