package lesson_9

fun main() {
    val oneDish = mutableListOf(2, 50, 15)

    println("Сколько порций вы будите заказывать?")

    val numberOfServings = readln().toInt()
    val portions = oneDish.map {
        it * numberOfServings
    }

    println("На $numberOfServings порций вам понадобится: Яиц - ${portions[0]} шт., молока - ${portions[1]} мл., " +
            "сливочного масла - ${portions[2]} гр. ")
}