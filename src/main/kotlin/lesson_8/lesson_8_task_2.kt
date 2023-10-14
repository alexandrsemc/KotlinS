package lesson_8


fun main() {
    val seaBassWithLeeks = arrayOf("sea bass", "butter", "leek", "vegetable oil", "olive oil", "salt", "pepper")
    println("Какой ингредиент вам необходим?")
    val ingredient = readln()
    for (i in seaBassWithLeeks) {
        if (i == ingredient)
            println("Ингредиент $ingredient в рецепте есть")
        else
            println("Такого ингредиента в рецепте нет")
    }
}