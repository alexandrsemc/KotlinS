package lesson_13

class PhoneBook(
    var name: List<String>,
    val phoneNumber: List<Long>,
    var company: List<String?>? = null,
)

fun main() {
    val representative = PhoneBook(
        name = listOf("Sam", "Ben", "Maksim", "Liza", "Karl"),
        phoneNumber = listOf(84994444444, 84957777777, 85005555555, 86008888888, 93003333333),
        company = listOf("Reddit", "Mars", "null", null, null),
    )
    println("-Name: ${representative.name[0]}\n-Number: ${representative.phoneNumber[0]}\n-Company: ${representative.company?.get(0)}\n")
    println("-Name: ${representative.name[1]}\n-Number: ${representative.phoneNumber[1]}\n-Company: ${representative.company?.get(1)}\n")
    println("-Name: ${representative.name[2]}\n-Number: ${representative.phoneNumber[2]}\n-Company: ${representative.company?.get(2)}\n")
    println("-Name: ${representative.name[3]}\n-Number: ${representative.phoneNumber[3]}\n-Company: ${representative.company?.get(3)}\n")
    println("-Name: ${representative.name[4]}\n-Number: ${representative.phoneNumber[4]}\n-Company: ${representative.company?.get(4)}\n")
}