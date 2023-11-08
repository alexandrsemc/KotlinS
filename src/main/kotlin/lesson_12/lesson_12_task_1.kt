package lesson_12

fun main() {
    val weatherProbability1 = Weather()
    weatherProbability1.daytimeTemperature = 34
    weatherProbability1.nightTemperature = 25
    weatherProbability1.precipitation = false

    val weatherProbability2 = Weather()
    weatherProbability2.daytimeTemperature = 31
    weatherProbability2.nightTemperature = 23
    weatherProbability2.precipitation = true

    weatherProbability1.dataOutput()
    weatherProbability2.dataOutput()
}

class Weather() {
    var daytimeTemperature = 32
    var nightTemperature = 22
    var precipitation = false

    fun dataOutput() {
        println("Погода:\nТемпература днем: $daytimeTemperature\nТемпература ночью: $nightTemperature\nОсадки: $precipitation\n")
    }
}