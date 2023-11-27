package lesson_17

class Ship {
    var name = "Andromeda"
        get() = field
        set(value:String) {
            field = value
            if (value != "Andromeda"){
                println("Имя корабля менять нельзя!")
            }
        }
    val averageSpeed = 200000
    val portOfRegistration = "Земля"
}


fun main() {
    val ship = Ship()
    println(ship.name)
    ship.name = "Sun"
}