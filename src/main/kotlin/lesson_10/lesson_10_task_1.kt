package lesson_10

fun main() {
    game()
}

fun game() {
    val range = 1..6
    val playerThrow = range.random()
    val computerTrow = range.random()
    println("Ход игрока: $playerThrow")
    println("Ход компьютера: $computerTrow")
    if (playerThrow > computerTrow)
        println("Победило человечество")
    else println("Победила машина")
}