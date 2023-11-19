package lesson_10

fun main() {
    val length = readln().toInt()
    println(generatePassword(length))
}

fun generatePassword(length: Int): String {
    val numbers = ('0'..'9')
    val symbols = (' '..'/')
    var password = ""
    for (i in 1..length / 2) {
        password += numbers.random()
        password += symbols.random()
    }
    if (length % 2 != 0) {
        password += numbers.random()
    }
    return password
}