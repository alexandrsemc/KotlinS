package lesson_17

class Ship {
    var name = "Andromeda"
        get() = "Имя каробля менять нельзя"
        set(value:String) {
            field = "Andromeda"
        }
    val averageSpeed = 200000
    val portOfRegistration = "Земля"
}

fun main() {
    val ship = Ship()
    println(ship.name)
}