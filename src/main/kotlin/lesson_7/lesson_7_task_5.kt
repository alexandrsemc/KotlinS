package lesson_7

fun main() {
    val numbers = 0..9
    val letters = 'a'..'z'
    val capitalLetters = 'A'..'Z'
    val allResult = numbers + letters + capitalLetters
    var maximumLength = readln().toInt()
    val minimumLength = 6

    if (maximumLength >= minimumLength) {
        while (maximumLength > 0) {
            maximumLength--
            val result = allResult.random()
            print(result)
        }
    }
}