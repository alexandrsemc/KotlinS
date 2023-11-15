package lesson_8

fun main() {
    println("Какое количество ингредиентов вы собироетесь ввести?:")
    val number = readln().toInt()
    val listOfIngredients = Array(number) { "" }
    for (i in 0 until number) {
        listOfIngredients[i] = readln()
    }
    for (i in listOfIngredients)
        print("$i ")
}