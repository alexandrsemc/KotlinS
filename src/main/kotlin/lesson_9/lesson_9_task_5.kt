package lesson_9

import java.util.*

fun main() {

    //  val userIngredients = "olives, cucumbers, potato, leek, water"
    val ingredient1 = readln()
    val ingredient2 = readln()
    val ingredient3 = readln()
    val ingredient4 = readln()
    val ingredient5 = readln()
    val ingredients = mutableListOf(ingredient1, ingredient2, ingredient3, ingredient4, ingredient5)
    val sortedList = ingredients.sorted()
    val convertToString = sortedList.joinToString()
    val capitalizedString =
        convertToString.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    val list: List<String> = listOf(*capitalizedString.split(",").toTypedArray())
    println(list)

}