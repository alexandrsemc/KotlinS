package lesson_5

fun main(){
    val numberFirst = 1
    val numberSecond = 7
    val task  = numberFirst + numberSecond

    println("Решите пример и введите ответ: ${numberFirst} + ${numberSecond} ")

    val solution = readln().toInt()
    val result = if( solution == task) "Добро пожаловать!"
    else "Доступ запрещен."

    println(result)

}