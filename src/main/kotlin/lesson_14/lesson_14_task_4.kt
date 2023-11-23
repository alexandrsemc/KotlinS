package lesson_14

open class Heavenly(
    val name: String,
    val atmosphere: Boolean,
    val landingPossible: Boolean,
)

class Planet(
    name: String,
    val listSatellite: List<String>
) : Heavenly(name,atmosphere = true, landingPossible = true)

class Satellite(
    name: String,
) : Heavenly(name,atmosphere = false,landingPossible = true)

fun main() {
    val planet = Planet("Mars", listSatellite = listOf("Nika", "Favorite"))

    println(planet.name)
    println(planet.listSatellite)

}