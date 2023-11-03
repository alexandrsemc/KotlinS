package lesson_11

fun main() {
    val user1: User = User(
        id = 21,
        login = "Fox",
        password = "12345",
        email = "Brain@mail.ru"
    )
    val user2: User = User(
        id = 27,
        login = "Cat",
        password = "54321",
        email = "Memory@mail.ru"
    )
    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)
    println()
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)

}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {

}