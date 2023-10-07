package lesson_4

fun main(){
    val armExercise = "Упражнения для рук:"
    val legExercise = "Упражнения для ног:"
    val backExercise = "Упражнения для спины:"
    val abdominalExercise = "Упражнения для пресса:"
    val day = 5
    val evenDay = ((day % 2 == 0))

    val conclusion  = """
        ${armExercise}       ${!evenDay}
        ${legExercise}       ${evenDay}
        ${backExercise}     ${evenDay}
        ${abdominalExercise}    ${!evenDay}
    """.trimIndent()

    println(conclusion)
}