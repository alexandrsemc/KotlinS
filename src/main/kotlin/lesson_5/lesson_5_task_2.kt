package lesson_5

fun main(){
    val yearOfBirth = readln().toInt()
    val yearNow = 2023
    val year = yearNow - yearOfBirth
    val result = if (year >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else "Вернуться на главный экран"
    println(result)
}

const val AGE_OF_MAJORITY = 18