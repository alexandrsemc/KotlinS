package lesson_7

fun main() {
    println("Сколько засечь секунд:")
    val time = readln().toInt()

    for (i in time downTo 0) {
        println("$i")
        Thread.sleep(1000)
    }
    println("Время вышло.")
}