package lesson_8

fun main() {

    var sum = 0
    val day1 = readln().toInt()
    val day2 = readln().toInt()
    val day3 = readln().toInt()
    val day4 = readln().toInt()
    val day5 = readln().toInt()
    val day6 = readln().toInt()
    val day7 = readln().toInt()
    val viewsPerWeek = intArrayOf(day1, day2, day3, day4, day5, day6, day7)
    for (i in viewsPerWeek) sum += i
    println(sum)
}