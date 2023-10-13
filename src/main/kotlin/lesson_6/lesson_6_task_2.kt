package lesson_6

fun main() {
    println("Сколько засечь секунд?")

    val numberOfSeconds = readln().toInt()
    val millisecond = 1000
    val time = numberOfSeconds * millisecond
    Thread.sleep(time.toLong())

    println("Прошло $numberOfSeconds секунд")
}