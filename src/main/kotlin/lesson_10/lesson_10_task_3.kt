package lesson_10

fun main() {
    val length = readln().toInt()
    println(toGeneratePassword(length))
}

fun toGeneratePassword(length: Int): String {
    val symbols = listOf(
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!',
        '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ' '
    )
    return (1..length)
        .map { symbols.random() }
        .joinToString("")
}