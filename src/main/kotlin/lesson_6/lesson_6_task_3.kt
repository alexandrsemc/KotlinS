package lesson_6

fun main(){
    println("Сколько секунд осталось?")
    var numberOfSeconds = readln().toInt()
    while (numberOfSeconds > 0) {
        println("Осталось секунд: ${numberOfSeconds--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}