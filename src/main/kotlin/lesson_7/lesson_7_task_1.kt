package lesson_7

fun main(){
    val range1 = 0..9
    val range2 = 'a'..'z'
    val listOfSymbols = range1 + range2
    var counter = 6

    while (counter >0) {
        counter--
        val result = listOfSymbols.random()
        print(result)
    }
}