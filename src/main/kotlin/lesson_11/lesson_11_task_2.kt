package lesson_11

fun main() {
    val user2: User2 = User2(
        id = 333,
        login = "Pettson",
        password = "Findus",
        email = "Sven@.com",
        bio = "Human",
    )

    user2.userInformation()

    user2.bio = user2.writeTextInBio()
    println("Запись в поле Био: ${user2.bio}")

    user2.password = user2.changePassword()
    println("Пароль изменен: ${user2.password}")

    val user3: User2 = User2(
        id = 334,
        login = "Sven",
        password = "A5",
        email = "Cat@.com",
        bio = "Man",
    )

    user3.password = "A6"

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
    var bio: String,
) {

    fun userInformation() {
        println("Идентификатор: $id")
        println("Логин: $login")
        println("Пароль: $password")
        println("Электронная почта: $email")
        println("Био: $bio")
    }

    fun writeTextInBio(): String {
        println("Считываем из консоли текст: ")
        return readln()

    }

    fun changePassword(): String {
        println("Введите текущий пароль:")
        if (readln() == "Findus") {
            println("Введите новый пароль: ")
        }
        return readln()

    }

}

