package lesson_11

fun main() {
    FavoritesTop(
        coverTop = "Фото-ассорти",
        nameTop = "ИЗБРАННОЕ"
    )

    Dish(
        cover = "фото-гамбургер",
        name = "КЛАССИЧЕСКИЙ ГАМБУРГЕР",
    )

    Dish(
        cover = "фото-чизбургер",
        name = "ЧИЗБУРГЕР",
    )

    Dish(
        cover = "фото-бургер с грибами и сыром",
        name = "БУРГЕР С ГРИБАМИ И СЫРОМ",
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

class FavoritesTop(
    val coverTop: String,
    val nameTop: String,
)

class Dish(
    val cover: String,
    val name: String,
)

class Button(
    val color: String,
    val name: String,
)