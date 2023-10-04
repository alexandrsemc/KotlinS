package lesson_3

fun main() {
    var from = "E2"
    var to = "E4"
    var moveNumber = 1
    var progressData = "$from-$to;$moveNumber "

    println(progressData)

    from = "D2"
    to = "D3"
    moveNumber = 2
    progressData = "$from-$to;$moveNumber "

    println(progressData)

}