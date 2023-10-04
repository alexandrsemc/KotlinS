package lesson_4

fun main(){
    val reservedTablesToday = 13
    val reservedTablesTommorow = 9
    val freeTablesToday = TOTAL_NUMBER_OF_TABLES > reservedTablesToday
    val freeTablesTommorow = TOTAL_NUMBER_OF_TABLES > reservedTablesTommorow

    println("Доступность столиков на сегодня: ${freeTablesToday}\nДоступность столиков на завтра: $freeTablesTommorow")
}

const val TOTAL_NUMBER_OF_TABLES = 13