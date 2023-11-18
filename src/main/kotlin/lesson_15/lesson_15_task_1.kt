package lesson_15

abstract class FlyingCreatures : MovementGull, MovementDuck {
}

abstract class SwimmingCreatures : MovementCarp {
}

class Carp : SwimmingCreatures() {
    override fun swimInTheWater() {
        println("Передвижение карась:")
        println("Медленно плыть в толще воды")
        println()
    }
}

class Gull : FlyingCreatures() {
    override fun fly() {
        println("Передвижение чайка:")
        println("Лететь над океаном")
    }

    override fun dive() {
        println("Нырять за рыбой")
        println()
    }
}

class Duck : FlyingCreatures() {
    override fun fly() {
        println("Передвижение утка:")
        println("Плыть по воде")
    }

    override fun dive() {
        println("Нырять за вкусной травой")
    }
}

interface MovementCarp {
    fun swimInTheWater()
}

interface MovementGull {
    fun fly()
}

interface MovementDuck {
    fun dive()
}

fun main() {
    val carp = Carp()
    carp.swimInTheWater()

    val gull = Gull()
    gull.fly()
    gull.dive()

    val duck = Duck()
    duck.fly()
    duck.dive()
}