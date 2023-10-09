package lesson_5

fun main(){
    println("Введите два числа от 1 до 100")
    println("Введите первое число: ")
    val yourNumber1 = readln()!!.toInt()
    println("Введите второе число: ")
    val yourNumber2 = readln()!!.toInt()
    val number1 = (1..100).random()
    val number2 = (1..100).random()
    val result = if( (yourNumber1 == number1 && yourNumber2 == number2) || (yourNumber1 == number2 && yourNumber2 == number1))
        "Поздравляем! Вы выйграли главный приз!"
    else if ( (yourNumber1 == number1 && yourNumber2 != number2) || (yourNumber1 == number2 && yourNumber2 != number1))
        "Вы выйграли утешительный приз"
    else "Попробуйте еще"
    println(result)
    println("Выйграшные числа: ${number1} и ${number2}")
}