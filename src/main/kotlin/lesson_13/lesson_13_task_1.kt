package lesson_13

fun main() {
    val regularCustomer = Buyer(
        name = "Sam",
        phoneNumber = 84994444444,
        company = "Star Trek",
    )
}

class Buyer(
    var name: String = "Ben",
    val phoneNumber: Long = 84993333333,
    val company: String? = null
)

