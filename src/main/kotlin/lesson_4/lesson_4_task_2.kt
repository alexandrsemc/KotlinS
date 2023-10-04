package lesson_4

fun main(){
    var newKilograms = 20
    var newVolume = 80
    var avarage = (newKilograms in FROM_KILOGRAMS .. TO_KILOGRAMS) && (newVolume <= VOLUME)

    println("Груз с весом ${newKilograms} кг и обьемом ${newVolume} л соответствует категории 'Avarage': ${avarage} ")
    newKilograms = 50
    newVolume = 100
    avarage = (newKilograms in FROM_KILOGRAMS .. TO_KILOGRAMS) && (newVolume <= VOLUME)

    println("Груз с весом ${newKilograms} кг и обьемом ${newVolume} л соответствует категории 'Avarage': ${avarage} ")

}

const val FROM_KILOGRAMS = 35
const val TO_KILOGRAMS = 100
const val VOLUME = 100