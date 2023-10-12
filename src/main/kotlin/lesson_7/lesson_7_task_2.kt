package lesson_7

fun main() {

    do {
        val random = (1000..9999).random()

        println("Ваш код авторизации: $random")
        println("Введите код для авторизации: ")

        val code = readln().toInt()

        if (random == code) {
            println("Добро пожаловать!")
        }

    } while (random != code)

}