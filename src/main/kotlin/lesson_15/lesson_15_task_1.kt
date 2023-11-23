package lesson_15

class Carp : Swimming {
    override fun swim() {
        println("Передвижение карась:")
        println("Медленно плыть в толще воды")
        println()
    }
}

class Gull : Flying, Diving {
    override fun fly() {
        println("Передвижение чайка:")
        println("Лететь над океаном")
    }

    override fun dive() {
        println("Нырять за рыбой")
        println()
    }
}

class Duck : Swimming, Flying, Diving {
    override fun fly() {
        println("Передвижение утка:")
        println("Перелет на другое озеро")
    }

    override fun dive() {
        println("Нырять за вкусной травой")
    }

    override fun swim() {
        println("Плыть по воде")
    }
}

interface Swimming {
    fun swim()
}

interface Flying {
    fun fly()
}

interface Diving {
    fun dive()
}

fun main() {
    val carp = Carp()
    carp.swim()

    val gull = Gull()
    gull.fly()
    gull.dive()

    val duck = Duck()
    duck.fly()
    duck.dive()
    duck.swim()
}