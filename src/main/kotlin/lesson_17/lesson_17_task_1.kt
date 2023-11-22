package lesson_17

class Animal() {
    var question = "Кто сказал мяу?"
        get() = field
        set(value: String) {
            field = "Кто сказал гав?"
        }
    var answer = "Котенок"
        set(value: String) {
            field = "Щенок"
        }
}

fun main() {

    val animal = Animal()
    println("old value: ${animal.question}")
    animal.question = "Кто сказал гав?"
    println("old value: ${animal.answer}")

    println("new value: ${animal.question}")
    animal.answer = "Щенок"
    println("new value: ${animal.answer}")
}