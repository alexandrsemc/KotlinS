package lesson_11

fun main() {
    CategoryDish(
        category = Dish(
            name = ("Классический гамбургер, Чизбургер, Бургер с грибами и сыром")
        )
    )

    Button(
        color = "цвет кнопки",
        name = "КАТЕГОРИИ",
    )

    Button(
        color = "цвет кнопки",
        name = "ИЗБРАННОЕ",
    )

}

class CategoryDish(
    val category: Dish,
)

class Dish(
    name: String,
    val isFavorite: Boolean = true,
)

class Button(
    val color: String,
    val name: String,
)