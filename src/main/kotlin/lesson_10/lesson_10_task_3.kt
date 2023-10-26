package lesson_10

fun main() {
    val length = readln().toInt()
    println(generatePassword(length))
}

fun generatePassword(length: Int): String {
    val symbols = ('0'..'9') + (' '..'/')
    return (1..length)
        .map { symbols.random() }
        .joinToString("")
}