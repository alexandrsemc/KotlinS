package lesson_6

fun main() {
    println("Создайте логин и пароль")

    val login = readln()
    val password = readln()
    println("Введите логин и пароль")
    var enteringLogin = readln()

    do {
        val enteringPassword = readln()
        if (enteringPassword != password) {
            println("Неверный пароль!\nВведите пароль заново.")
        }
        if (enteringPassword == password) {
            println("Авторизация прошла успешно")
        }
    } while(enteringPassword != password)
}