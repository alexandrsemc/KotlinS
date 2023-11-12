package lesson_3

fun main() {
    val move = "D2-D4;0"
    val moveSplit: List<String> = move.split("-", ";")

    val from = moveSplit[0]
    val to = moveSplit[1]
    val moveNumber = moveSplit[2]

    println("${from}\n${to}\n${moveNumber}")
}








