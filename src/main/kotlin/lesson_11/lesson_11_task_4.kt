package lesson_11

fun main() {
    val hamburger = Dish(
        name = "КЛАССИЧЕСКИЙ ГАМБУРГЕР",
        picture = "cсылка на картинку",
        ingredients = listOf("Котлета, лук, помидор, салат, булочка"),
    )

    val cheeseburger = Dish(
        name = "ЧИЗБУРГЕР",
        picture = "cсылка на картинку",
        ingredients = listOf("Котлета, сыр, яйцо, лук, помидор, салат, булочка"),
    )

    val burger = Dish(
        name = "БУРГЕР С ГРИБАМИ И СЫРОМ",
        picture = "cсылка на картинку",
        ingredients = listOf("Котлета, грибы, сыр, яйцо, лук, помидор, салат, булочка"),
    )

    CategoryDish(
        nameCategory = "ИЗБРАННОЕ",
        picture = "cсылка на картинку",
        listOfDish = listOf(hamburger, cheeseburger, burger)
    )
}

class CategoryDish(
    val nameCategory: String,
    val picture: String,
    val listOfDish: List<Dish>,
)

class Dish(
    val name: String,
    val picture: String,
    val ingredients: List<String>,
)

