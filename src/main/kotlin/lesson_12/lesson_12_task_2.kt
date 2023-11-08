package lesson_12

fun main(){
    val weatherTomorrow1 = WeatherTomorrow(32,22,false)

    weatherTomorrow1.dataOutput()
}


class WeatherTomorrow(var daytimeTemperature: Int, var nightTemperature: Int, var precipitation: Boolean) {


    fun dataOutput() {
        println("Погода:\nТемпература днем: $daytimeTemperature\nТемпература ночью: $nightTemperature\nОсадки: $precipitation")
    }
}