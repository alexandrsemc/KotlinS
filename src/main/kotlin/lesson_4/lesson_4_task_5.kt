package lesson_4

fun main(){
    val isNotPresenceOfDamage = readln().toBoolean()
    val isCrewComposition = readln().toInt()
    val isBoxesOfProvisions = readln().toInt()
    val isGoodWeather = readln().toBoolean()
    val isTheShipIsReady = (isNotPresenceOfDamage) && (isCrewComposition in MINIMUM_CREW .. MAXIMUM_CREW)
            && (isBoxesOfProvisions >= 50) && (isGoodWeather) || (isCrewComposition == MAXIMUM_CREW) && (isBoxesOfProvisions >= 50) && (isGoodWeather)

    println( "The ship is ready to sail: ${isTheShipIsReady}")
}
const val MINIMUM_CREW = 55
const val MAXIMUM_CREW = 70