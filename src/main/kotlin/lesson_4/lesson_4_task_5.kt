package lesson_4

fun main(){
    val presenceOfDamage = readln().toBoolean()
    val crewComposition = readln().toInt()
    val boxesOfProvisions = readln().toInt()
    val goodWeather = readln().toBoolean()
    val theShipIsReady = (presenceOfDamage == false) && (crewComposition in MINIMUM_CREW .. MAXIMUM_CREW) && (boxesOfProvisions >= 50) && (goodWeather == true)

    println( "The ship is ready to sail: ${theShipIsReady}")
}
const val MINIMUM_CREW = 55
const val MAXIMUM_CREW = 70