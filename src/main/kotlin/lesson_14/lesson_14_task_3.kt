package lesson_14

open class Figure(
    val color: String,
) {
    open fun calculateTheArea() {

    }

    open fun calculatePerimeter() {

    }
}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {
    override fun calculateTheArea() {
        val areaOfACircle: Double = PI * radius * radius
    }

    override fun calculatePerimeter() {
        val circumference: Double = 2 * PI * radius
    }
}

class Rectangle(
    color: String,
    val width: Int,
    val height: Int,
) : Figure(color) {
    override fun calculateTheArea() {
        val square: Int = width * height
    }

    override fun calculatePerimeter() {
        val perimeter: Int = 2 * (width + height)

    }
}

fun main() {
    val circleWhite = Circle("белый", 11)
    val circleBlack = Circle("черный", 12)
    circleBlack.calculatePerimeter()
    circleWhite.calculateTheArea()

    val radius1 = circleBlack.radius
    val radius2 = circleWhite.radius
    val formula1 = 2 * PI * radius1
    val formula2 = 2 * PI * radius2

    val rectangleWhite = Rectangle("белый", 13, 14)
    val rectangleBlack = Rectangle("черный", 15, 16)
    rectangleBlack.calculatePerimeter()
    rectangleWhite.calculateTheArea()

    val width = rectangleBlack.width
    val height = rectangleBlack.height
    val formula3 = 2 * (width + height)

    val width1 = rectangleWhite.width
    val height1 = rectangleWhite.height
    val formula4 = 2 * (width1 + height1)

    println("Сумма периметров черных фигур:")
    println(formula1.toInt() + formula3)

    println("Сумма площадей всех белых фигур:")
    println(formula2.toInt() + formula4)

}

const val PI = 3.14