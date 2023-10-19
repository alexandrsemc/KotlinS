package lesson_9

fun main() {
    val ingredients = readln()
    val mutableList: MutableList<String> = mutableListOf(ingredients)
    println(mutableList)
    mutableList.sort()
    println(mutableList)
}