package lesson_6

fun main(){
    println("Угадай число от 1 до 9")
    var attempt = 5
    val numberN = 7

    while (attempt > 0 ){
        val entering = readln().toInt()
        --attempt
        if (entering != numberN)
            println("Неверно, осталось $attempt попыток")
        else if(attempt == 0)
            println("Было загадано число $numberN")
        if (entering == numberN)
            println("Это была великолепная игра!")

    }
}