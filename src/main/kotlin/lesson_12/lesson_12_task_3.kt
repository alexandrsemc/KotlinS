package lesson_12

fun main(){
    val weatherInCelsius = WeatherToday()
    weatherInCelsius.daytimeTemperature = weatherInCelsius.daytimeTemperature - TEMPERATURE_IN_KELVINS
    weatherInCelsius.nightTemperature = weatherInCelsius.nightTemperature - TEMPERATURE_IN_KELVINS
    weatherInCelsius.precipitation = true

    weatherInCelsius.dataOutput()
}
class WeatherToday() {
    var daytimeTemperature = 305
    var nightTemperature = 297
    var precipitation = false

    fun dataOutput() {
        println("Погода:\nТемпература днем: $daytimeTemperature\nТемпература ночью: $nightTemperature\nОсадки: $precipitation")
    }

}

const val TEMPERATURE_IN_KELVINS = 273