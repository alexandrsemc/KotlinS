package lesson_2

fun main(){
    val departureHour = 9
    val departureMinutes = 39
    val travelTime = 457
    val travelHour = travelTime / 60
    val travelMinutes = travelTime % 60
    val departureMinutesAndTravel = departureMinutes + travelMinutes
    val arrivalHour = departureHour + travelHour + (departureMinutesAndTravel / 60)
    val arrivalMinutes = departureMinutesAndTravel % 60
    val arrivalTime = String.format("%02d:%02d", arrivalHour, arrivalMinutes )

    println(arrivalTime)

}