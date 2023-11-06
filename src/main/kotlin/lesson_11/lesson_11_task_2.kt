package lesson_11

fun main() {
    val user2: User2 = User2(
        id = 333,
        login = "Pettson",
        password = "Findus",
        email = "Sven@.com",
        bio = " "
    )
    user2.userInformation()

    user2.writeTextInBio()

    user2.changePassword()

    val user3: User2 = User2(
        id = 334,
        login = "Sven",
        password = "A5",
        email = "Cat@.com",
        bio = "Animal"
    )
    println("Создали обьект и заполнили: \nИдентификатор: ${user3.id} \nЛогин: ${user3.login} \nПароль: ${user3.password} \nЭлектронная почта: ${user3.email} \nБио: ${user3.bio}")
    println()
    user3.password = "A6"
    println("Заменили пароль, выводим обновленную информацию:")
    println("Идентификатор: ${user3.id} \nЛогин: ${user3.login} \nПароль: ${user3.password} \nЭлектронная почта: ${user3.email} \nБио: ${user3.bio}")
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String,
) {

    fun userInformation() {
        println("Идентификатор: $id \nЛогин: $login \nПароль: $password \nЭлектронная почта: $email \nБио: $bio")
    }

    fun writeTextInBio() {
        println("Считываем из консоли текст: ")
        bio = readln()
        println("Запись в Био: $bio")
        println()
    }

    fun changePassword() {
        println("Считываем текущий пароль: $password")
        println("Запрашиваем новый пароль: ")
        password = readln()
        println("Пароль изменен: $password")
        println()
    }
}


