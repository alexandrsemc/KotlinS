package lesson_13

class PhoneBook(
    var name: String = "Ben",
    val phoneNumber: Long = 84993333333,
    var company: String? = null
)

fun main() {

    val representative = listOf(
        PhoneBook("Sam", 8799555555, "Subway"),
        PhoneBook("Gregory", 8799555555),
        PhoneBook("Maria", 8799555555, "Null"),
        PhoneBook("Ksenia", 8798555555),
        PhoneBook("Ben", 8799555555, "Sunlight"),
    )

    val listOfCompanies = representative.map { it -> it.company }
        .toList()
    println(listOfCompanies)
}