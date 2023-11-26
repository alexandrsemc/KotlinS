package lesson_19

fun main() {

    val fish = listOf(Fish.GUPPY, Fish.ANGELFISH, Fish.GOLDFISH, Fish.SIAMESE_FIGHTING_FISH)
    println("Вы можете добавить в свой аквариум: $fish")

}

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}