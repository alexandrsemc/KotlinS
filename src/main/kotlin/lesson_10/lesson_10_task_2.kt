package lesson_10

fun main() {
    getLength()
}

fun getLength(): String {
    val login = readln().length
    val password = readln().length
    val minCharacterLength = 4
    val result = if (login >= minCharacterLength && password
        >= minCharacterLength
    ) "Добро пожаловать"
    else "Логин и пароль недостаточно длиные"
    println(result)
    return result
}