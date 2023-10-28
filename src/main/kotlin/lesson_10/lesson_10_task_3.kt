package lesson_10

fun main() {
    val length = readln().toInt()
    println(generatePassword(length))
}
fun generatePassword(length: Int): String {
    val numbers = ('0'..'9')
    val symbols = (' '..'/')
    var n = 1
    while (n <= length / 2) {
        val result1 = numbers.random()
        print(result1)
        val result2 = symbols.random()
        print(result2)
        n += 1
    }
    return length.toString()
}