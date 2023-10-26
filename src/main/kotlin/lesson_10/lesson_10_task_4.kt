package lesson_10

fun main() {
    var counter = 1
    var counter2 = 0
    while (counter > 0) {
        counter++
        val playerThrow: Int = quil()
        val computerTrow: Int = quil()
        println("Ход игрока: $playerThrow")
        println("Ход компьютера: $computerTrow")
        if (playerThrow > computerTrow) {
            println("Победило человечество")
            counter2++
        } else println("Победила машина")
        println("Хотите бросить кости еще раз?")
        val actionSelection = readln()
        if (letsPlay(actionSelection)) {
            println("Человек выйграл: $counter2 раза")
            break
        }
    }
}

fun quil(): Int {
    val range = 1..6
    return range.random()
}

fun letsPlay(a: String): Boolean {
    return a == "no"
}