package lesson_9

fun main() {
    val userIngredients = readln()
    val list = userIngredients.split(", ")
    val sortedList = list.sorted()
    println(sortedList)
}