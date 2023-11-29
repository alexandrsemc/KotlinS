package lesson_19

@OptIn(ExperimentalStdlibApi::class)
fun main() {
    println("Вы можете добавить в свой аквариум: ")
    for (fish in Fish.entries) {
        println(fish.name)
    }
}

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}