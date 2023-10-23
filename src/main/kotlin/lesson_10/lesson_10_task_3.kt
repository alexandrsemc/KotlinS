package lesson_10

fun main() {
    val length = readln().toInt()
    println(passwordGeneration(length))
}

fun passwordGeneration(length: Int): String {
    val symbols = ('0'..'9') + listOf('!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ' ')
    return (1..length)
        .map { symbols.random() }
        .joinToString("")
}