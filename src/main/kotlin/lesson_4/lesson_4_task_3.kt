package lesson_4

fun main() {
    val sunnyToday = true
    val awningOpenToday = true
    val airHumidityToday = 20
    val seasonToday = "winter"
    val comparisonResult = (sunnyToday == SUNNY) && (awningOpenToday == AWNING_OPEN) && (airHumidityToday == AIR_HUMIDITY ) && (seasonToday == SEASON)
    println("Благоприятные ли условия сейчас для роста бобовых? ${comparisonResult}")
}

const val SUNNY = true
const val AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "not winter"