package lesson_9

import java.util.*

fun main() {
    val ingredients = MutableList(5) { readln() }.toSet().sorted().joinToString()
    val capitalizedString =
        ingredients.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    println(capitalizedString)
}