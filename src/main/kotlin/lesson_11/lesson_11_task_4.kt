package lesson_11

fun main() {
    Dish(
        name = "КЛАССИЧЕСКИЙ ГАМБУРГЕР",
        picture = "cсылка на картинку",
        ingredients = listOf("Котлета, лук, помидор, салат, булочка"),
    )

    Dish(
        name = "ЧИЗБУРГЕР",
        picture = "cсылка на картинку",
        ingredients = listOf("Котлета, сыр, яйцо, лук, помидор, салат, булочка"),
    )

    Dish(
        name = "БУРГЕР С ГРИБАМИ И СЫРОМ",
        picture = "cсылка на картинку",
        ingredients = listOf("Котлета, грибы, сыр, яйцо, лук, помидор, салат, булочка"),
    )

    CategoryDish(
        nameCategory = "ИЗБРАННОЕ",
        picture = "cсылка на картинку",
        listOfDish = listOf(
            "КЛАССИЧЕСКИЙ ГАМБУРГЕР,ЧИЗБУРГЕР,БУРГЕР С ГРИБАМИ И СЫРОМ"
        )
    )
}

class CategoryDish(
    val nameCategory: String,
    val picture: String,
    val listOfDish: List<String>,
)

class Dish(
    val name: String,
    val picture: String,
    val ingredients: List<String>,
)

