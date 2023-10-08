package lesson_5

fun main(){
    val name = readln()!!.toString()
    val password = readln()!!.toString()
    val result = if (name != NAME)"Зарегестрируйтесь"
    else if (name == NAME && password == PASSWORD)"Добро пожаловать"
    else "Не правильный пароль"

    println(result)
}

const val NAME = "Zaphod"
const val PASSWORD = "PanGalactic"