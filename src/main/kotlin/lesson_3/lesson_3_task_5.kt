package lesson_3

fun main(){
    val move = "D2-D4;0"
    val moveSplit = move.split("-" , ";" )

    println(moveSplit)

    val from = "D2"
    val to = "D4"
    val moveNumber = "0"

    println("${from}\n${to}\n${moveNumber}")

}