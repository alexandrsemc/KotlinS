package lesson_11

fun main() {
    val user2: User2 = User2(
        id = 333,
        login = "Pettson",
        password = "Findus",
        email = "Sven@.com",
    )

    user2.userInformation()

    user2.writeTextInBio()

    if (user2.changePassword() == "Findus") {
        println("Введите новый пароль: ")
    }
    user2.password = readln()

    println("Пароль изменен: ${user2.password}")

    val user3: User2 = User2(
        id = 334,
        login = "Sven",
        password = "A5",
        email = "Cat@.com",
    )

    user3.password = "A6"

    println()
    println(user3.id)
    println(user3.login)
    println(user3.password)
    println(user3.email)
    println(user3.bio)
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: Boolean = false,
) {

    fun userInformation() {
        println("Идентификатор: $id")
        println("Логин: $login")
        println("Пароль: $password")
        println("Электронная почта: $email")
        println("Био: $bio")
        println()
    }

    fun writeTextInBio() {
        println("Считываем из консоли текст: ")
        bio = readln().toBoolean()
    }

    fun changePassword(): String {
        println("Введите текущий пароль:")
        return readln()
    }

}

