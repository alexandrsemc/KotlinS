package lesson_13

class BuyerName(
    var name: String = "Ben",
    val phoneNumber: Long = 84993333333,
    var company: String? = null
) {
    fun printOutTheInformation() {
        println("-Name: $name\n-Number: $phoneNumber\n-Company: ${company?:"<не указано>"} ")
    }
}

fun main() {
    val regularCustomer = BuyerName(
        name = "Sam",
        phoneNumber = 84994444444,
    )
    regularCustomer.printOutTheInformation()
}