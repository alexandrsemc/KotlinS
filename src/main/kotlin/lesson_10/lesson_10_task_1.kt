package lesson_10

fun main() {
    val playerThrow: Int = getThrow()
    val computerTrow: Int = getThrow()
    println("Ход игрока: $playerThrow")
    println("Ход компьютера: $computerTrow")
    if (playerThrow > computerTrow) {
        println("Победило человечество")
    } else println("Победила машина")
}

fun getThrow(): Int {
    val range = 1..6
    return range.random()
}