package lesson_5

fun main(){
    val task  = "1 + 6"
    println(task)

    val solution = readln()!!.toInt()
    val result = if( solution == 7) "Добро пожаловать!"
    else "Доступ запрещен."

    println(result)

}