package lesson_4

fun main(){
    val armExercise = "Упражнения для рук:"
    val legExercise = "Упражнения для рук:"
    val backExercise = "Упражнения для рук:"
    val abdominalExercise = "Упражнения для рук:"
    val day = 5
    val fairDay = ((day % 2 != 0))
    val notAnEvenDay = ((day % 2 == 0))

    val conclusion  = """
        ${armExercise}       ${fairDay}
        ${legExercise}       ${notAnEvenDay}
        ${backExercise}       ${notAnEvenDay}
        ${abdominalExercise}       ${fairDay}
    """.trimIndent()
    println(conclusion)
}