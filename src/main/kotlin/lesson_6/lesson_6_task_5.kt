package lesson_6

fun main() {
    var counter = 3
    val range1 = 1..9
    val range2 = 1..9
    do {
        counter--
        val random1 = range1.random()
        val random2 = range2.random()
        val sum = random1 + random2
        println("Решите пример: ${random1} + ${random2}")
        val result = readln().toInt()
        if (sum != result)
            println("Неверно")
        if (counter == 0 && sum != result)
            println("Доступ запрещен")
        if (sum == result)
            println("Добро пожаловать!")
    } while (counter > 0 && sum != result)
}