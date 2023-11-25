package lesson_16

import kotlin.math.pow

class Circle(private var radius: Double = 10.0) {

    private val degree: Double = 2.0

    fun calculateTheCircumference() {
        val circumference = 2 * NUMBER_PI * radius
        println(circumference)
    }

    fun calculateTheAreaOfACircle() {
        val areaOfACircle = NUMBER_PI * radius.pow(degree)
        println(areaOfACircle)
    }

}

private const val NUMBER_PI = 3.14

fun main() {
    val circle = Circle(10.0)
    circle.calculateTheCircumference()
    circle.calculateTheAreaOfACircle()
}