package lesson_18

class Order {

    fun showOrder(
        numberOrder: Int,
        product: String,
    ) {
        println("Заказан товар ($numberOrder): $product")
    }

    fun showOrder(
        numberOrder: Int,
        product: List<String>,
    ) {
        println("Заказаны следующие товары ($numberOrder): $product")
    }
}

fun main() {
    val order1 = Order()
    val order2 = Order()
    order1.showOrder(1, "Салат \"Греческий\"")
    order2.showOrder(2, listOf("Базилик, Брынза"))
}