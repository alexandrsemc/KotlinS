package lesson_7

fun main() {
    val range1 = 0..9
    val range2 = 'a'..'z'
    var counter = 3

    while (counter > 0) {
        counter--
        val result1 = range1.random()
        print(result1)
        val result2 = range2.random()
        print(result2)
    }
}