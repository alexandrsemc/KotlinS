package lesson_10

fun main() {
    val login = readln()
    val password = readln()
    val result =
        if (validateLength(login) && validateLength(password))
            "Добро пожаловать"
        else
            "Логин и пароль недостаточно длиные"
    println(result)
}

fun validateLength(a: String): Boolean {
    return a.length >= MINIMUM_NUMBER_OF_CHARACTERS
}

const val MINIMUM_NUMBER_OF_CHARACTERS = 4