package id.ac.polbeng.depandi.test_kelas

data class Product(val name: String, val price: Int)

fun main() {
    val p1 = Product("Laptop", 10000000)

    val p2 = p1.copy(price = 12000000)

    println(p1)
    println(p2)
}