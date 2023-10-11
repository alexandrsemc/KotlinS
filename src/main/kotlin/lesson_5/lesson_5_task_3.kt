package lesson_5

fun main(){
    println("Введите два числа от 1 до 100")
    println("Введите первое число: ")
    val yourNumber1 = readln().toInt()
    println("Введите второе число: ")
    val yourNumber2 = readln().toInt()
    val result = if( (yourNumber1 == SUPER_NUMBER1 && yourNumber2 == SUPER_NUMBER2) || (yourNumber1 == SUPER_NUMBER2 && yourNumber2 == SUPER_NUMBER1))
        "Поздравляем! Вы выйграли главный приз!"
    else if (( yourNumber1 == SUPER_NUMBER1  || yourNumber2 == SUPER_NUMBER2 ) || (yourNumber1 == SUPER_NUMBER2 || yourNumber2 == SUPER_NUMBER1))
        "Вы выйграли утешительный приз"
    else "Неудача! Крутите барабан"
    println(result)
    println("Победные числа: $SUPER_NUMBER1 и $SUPER_NUMBER2")

}

const val SUPER_NUMBER1 = 7
const val SUPER_NUMBER2 = 21