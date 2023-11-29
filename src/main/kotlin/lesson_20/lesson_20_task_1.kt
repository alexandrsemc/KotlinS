package lesson_20

fun main() {
    val userName = readln()
    val toCongratulateWithNewYear: () -> String = fun(): String = "С наступающим Новым Годом, $userName!"
    println(toCongratulateWithNewYear())
}