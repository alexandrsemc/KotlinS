package lesson_16

class Circle(private var radius: Int = 10) {

    private val numberPi = 3.14

    fun calculateTheCircumference() {
        val circumference = 2 * numberPi * radius
        println(circumference)
    }

    fun calculateTheAreaOfACircle() {
        val areaOfACircle = numberPi * (radius * radius)
        println(areaOfACircle)
    }

}

fun main() {
    val circle = Circle(10)
    circle.calculateTheCircumference()
    circle.calculateTheAreaOfACircle()
}