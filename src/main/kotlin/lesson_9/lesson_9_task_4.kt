package lesson_9

fun main() {
    val userIngredients = "olives, cucumbers, potato, leek, water"
    val list = mutableListOf("olives", "cucumbers", "potato", "leek", "water")
    list.sort()
    println(list)
}