package lesson_16

class Cube() {
    private val randomNumber = (1..6).random()

    fun numberPrintout() {
        println(randomNumber)
    }
}

fun main() {

    val cube = Cube()
    cube.numberPrintout()

}