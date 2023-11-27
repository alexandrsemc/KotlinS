package lesson_19

fun main() {
    println("Вы можете добавить в свой аквариум: ")
    for (fish in Fish.values()) {
        println(fish.name)
    }
}

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}