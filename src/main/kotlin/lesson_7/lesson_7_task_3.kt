package lesson_7

fun main() {

    println("Введите число:")

    val code = readln().toInt()
    val number = 0..code
    for (i in number step 2) {
        println(i)
    }
}