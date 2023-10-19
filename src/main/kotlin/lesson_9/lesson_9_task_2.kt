package lesson_9

fun main() {
    val list = mutableListOf("tea leaves", "boiling water", "piece of lemon")
    println("В рецепте есть базовые ингредиенты: $list")
    println("Желаете добавить еще?")
    val userResponse = readln()
    if (AGREEMENT_YES == userResponse) {
        println("Какой ингредиент вы хотели бы добавить?")
        val newIngredient = readln()
        list.add(0, newIngredient)
    } else {
        return
    }
    println("Теперь в рецепте есть следующие ингредиенты: $list")
}

const val AGREEMENT_YES = "yes"