package lesson_4

fun main() {
    val isSunny = true
    val isAwningOpen = true
    val airHumidityToday = 20
    val seasonToday = "winter"
    val isComparisonResult = (isSunny == IS_SUNNY) && (isAwningOpen == IS_AWNING_OPEN) && (airHumidityToday == AIR_HUMIDITY ) && (seasonToday == SEASON)
    println("Благоприятные ли условия сейчас для роста бобовых? ${isComparisonResult}")
}

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "not winter"