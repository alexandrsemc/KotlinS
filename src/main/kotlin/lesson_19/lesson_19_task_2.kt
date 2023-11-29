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

fun setCategory(category: Category) =
    when (category) {
        Category.CLOTH -> "Одежда"
        Category.STATIONERY -> "Канцелярские товары"
        Category.MISCELLANEOUS -> "Разное"
    }


class Description(
    val name: String,
    val id: Int,
    var category: Category,
) {

    fun displayInformation() {
        println("Имя товара - $name, идентификатор - $id, категория - ${setCategory(category)}")
    }
}