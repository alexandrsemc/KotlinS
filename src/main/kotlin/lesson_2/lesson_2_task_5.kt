package lesson_2

import kotlin.math.pow

fun main() {
    val initialAmount = 70000.0
    val interestRate = 16.7
    val investmentTime = 20.0
    val totalSavings: Double =   initialAmount * (1 + interestRate / 100.0).pow(investmentTime)
    println("%.3f".format(totalSavings))

}