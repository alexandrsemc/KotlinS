package lesson_19

fun main() {
    val outerwear = Description(
        name = "Куртка",
        id = 1,
        category = Category.CLOTH,
    )
    val shoes = Description(
        name = "Ручка",
        id = 2,
        category = Category.STATIONERY,
    )

    outerwear.displayInformation()
    shoes.displayInformation()

}

enum class Category {
    CLOTH,
    STATIONERY,
    MISCELLANEOUS;
}

private fun setCategory(category: Category) {
    when (category) {
        Category.CLOTH -> println("Одежда")
        Category.STATIONERY -> println("Канцелярские товары")
        Category.MISCELLANEOUS -> println("Разное")
    }
}

class Description(
    val name: String,
    val id: Int,
    val category: Category,
) {

    fun displayInformation() {
        println("Имя товара - $name, идентификатор - $id, категория - $category")
    }
}