package lesson_6

fun main(){
    println("Создайте логин и пароль")
    val login = readln().toString()
    val password = readln().toString()

    println("Введите логин и пароль")
    var counter = 0
    do {
        counter++
        var enteringLogin = readln().toString()
        val enteringPassword = readln().toString()

        if (enteringPassword == password)
            println("Авторизация прошла успешно")
        else
            println("Пароль неверный")
    }while (counter >0)
}