package lesson_6

fun main(){
    println("Создайте логин и параоль")

    val login = readln()!!.toString()
    val password = readln()!!.toString()
    println("Введите логин и пароль")
    var enteringLogin = readln()!!.toString()
    var enteringPassword = readln()!!.toString()


    while (enteringPassword != password)
        enteringPassword = readln()!!.toString()

    println("Авторизация прошла успешно")
}