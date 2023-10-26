package lesson_10

fun main() {
    val login = readln()
    val password = readln()
    val result = if (getLength(login) && getLength(password)
    ) "Добро пожаловать"
    else "Логин и пароль недостаточно длиные"
    println(result)
}

fun getLength(a: String): Boolean {
    return a.length >= 4
}