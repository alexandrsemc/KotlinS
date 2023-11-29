package lesson_18

class Cube4 {
    fun diceRoll(numberOfFaces: Int) {
        val result = (1..numberOfFaces).random()
        println(result)
    }
}

class Cube6 {
    fun diceRoll(numberOfFaces: Int) {
        val result = (1..numberOfFaces).random()
        println(result)
    }
}

class Cube8 {
    fun diceRoll(numberOfFaces: Int) {
        val result = (1..numberOfFaces).random()
        println(result)
    }
}

fun main() {
    val cube4 = Cube4()
    cube4.diceRoll(4)
    val cube6 = Cube6()
    cube6.diceRoll(6)
    val cube8 = Cube8()
    cube8.diceRoll(8)
}