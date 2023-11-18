package lesson_14

open class Liner(
    val speedInKnots: Byte,
    val liftingCapacityTons: Int,
    val numberOfPassengers: Int,
)
class Cargo(
    speedInKnots: Byte,
    liftingCapacityTons: Int,
    numberOfPassengers: Int,
) : Liner(speedInKnots, liftingCapacityTons, numberOfPassengers)
class Icebreaker(
    speedInKnots: Byte,
    liftingCapacityTons: Int,
    numberOfPassengers: Int,
) : Liner(speedInKnots, liftingCapacityTons, numberOfPassengers) {
    fun crushIce() {}
}
fun main() {

    Liner(20, 15000, 7000)

    Cargo(10, 25000, 1000)

    Icebreaker(5, 20000, 2000)

}