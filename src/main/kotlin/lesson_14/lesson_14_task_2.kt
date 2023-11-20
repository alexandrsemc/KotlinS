package lesson_14

open class Liner2(
    val speedInKnots: Byte,
    val liftingCapacityTons: Int,
    val numberOfPassengers: Int,
) {
    open fun displayShipProperties() {
        println("Свойство Лайнера: скорость - $speedInKnots, грузоподьемность - $liftingCapacityTons, вместительность - $numberOfPassengers")
    }

    fun pullOutTheLadder() {
        println("Выдвижение горизонтального трапа со шкафута")
    }
}

class Cargo2(
    speedInKnots: Byte,
    liftingCapacityTons: Int,
    numberOfPassengers: Int,
) : Liner2(speedInKnots, liftingCapacityTons, numberOfPassengers) {

    fun activateTheTap() {
        println("Активация погрузочного крана")
    }

    override fun displayShipProperties() {
        println("Свойство Грузового: скорость - $speedInKnots, грузоподьемность - $liftingCapacityTons, вместительность - $numberOfPassengers")

    }
}

class Icebreaker2(
    speedInKnots: Byte,
    liftingCapacityTons: Int,
    numberOfPassengers: Int,
) : Liner2(speedInKnots, liftingCapacityTons, numberOfPassengers) {

    fun openTheGate() {
        println("Открытие ворот со стороны кормы")
    }

    override fun displayShipProperties() {
        println("Свойство Ледокола: скорость - $speedInKnots, грузоподьемность - $liftingCapacityTons, вместительность - $numberOfPassengers")
    }
}

fun main() {

    val liner2 = Liner2(20, 15000, 7000)
    liner2.displayShipProperties()

    val cargo2 = Cargo2(10, 25000, 1000)
    cargo2.displayShipProperties()

    val icebreaker2 = Icebreaker2(5, 20000, 2000)
    icebreaker2.displayShipProperties()
}