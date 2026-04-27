package id.ac.polbeng.depandi.test_kelas

class InitOrder(name: String) {

    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block: $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block: ${name.length}")
    }
}

fun main() {
    InitOrder("RPL")
}