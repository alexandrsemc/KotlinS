package lesson_10

fun main() {
    var numberOfVictories = 0
    do {
        val playerThrow: Int = quil()
        val computerTrow: Int = quil()
        println("Ход игрока: $playerThrow")
        println("Ход компьютера: $computerTrow")

        if (playerThrow > computerTrow) {
            println("Победило человечество")
            numberOfVictories++
        } else println("Победила машина")

        println("Хотите бросить кости еще раз?")
        val actionSelection = readln()

        if (choose(actionSelection)) {
            println("Человек выйграл: $numberOfVictories раза")
        }
    } while (actionSelection == "yes")
}

fun quil(): Int {
    val range = 1..6
    return range.random()
}

fun choose(answer: String): Boolean {
    return answer == "no"
}