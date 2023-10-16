package lesson_8

fun main() {
    val viewsPerWeek = IntArray(7)

    for (i in 0 until 7) {
        println("Введите просмотры для ${i + 1} дня:")
        viewsPerWeek[i] = readln().toInt()
    }
    println(viewsPerWeek.sum())
}