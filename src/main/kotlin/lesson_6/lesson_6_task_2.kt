package lesson_6

fun main() {
    println("Сколько засечь секунд?")
    var numberOfSeconds = readln().toInt()
    val number = numberOfSeconds
    while (numberOfSeconds > 0) {
        numberOfSeconds--
        Thread.sleep(1000)
    }
    println("Прошло ${number} секунд")
}