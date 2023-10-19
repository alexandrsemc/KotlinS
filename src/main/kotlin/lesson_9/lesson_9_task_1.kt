package lesson_9

fun main() {
    val list = listOf("sea bass", "butter", "leek", "vegetable oil", "olive oil", "salt", "pepper")
    println("В рецепте есть следующие ингредиенты: $list")
    for (i in list) {
        println(i)
    }
}