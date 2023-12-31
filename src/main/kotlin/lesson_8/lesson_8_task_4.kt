package lesson_8

fun main() {
    val seaBassWithLeeks = arrayOf("sea bass", "butter", "leek", "vegetable oil", "olive oil", "salt", "pepper")
    println("Ингредиенты: ")
    for (i in seaBassWithLeeks) {
        println(i)
    }
    println("Какой ингредиент вы хотели бы заменить?")
    val ingredient = readln()
    if (ingredient in seaBassWithLeeks) {
        println("Какой ингредиент вы хотели бы добавить?")
        val newIngredient = readln()
        seaBassWithLeeks.indexOf(ingredient)
        seaBassWithLeeks[seaBassWithLeeks.indexOf(ingredient)] = newIngredient
    } else {
        println("Такого ингредиента в рецепте нет")
        return
    }
    println("Готово! Вы сохранили следующий список: ")
    for (i in seaBassWithLeeks) {
        println(i)
    }
}