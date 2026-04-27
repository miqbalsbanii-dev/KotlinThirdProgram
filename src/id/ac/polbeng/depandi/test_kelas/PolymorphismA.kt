package id.ac.polbeng.depandi.test_kelas

class Calculator {

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun add(a: Double, b: Double): Double {
        return a + b
    }
}

fun main() {
    val calc = Calculator()

    println(calc.add(2, 3))
    println(calc.add(2.5, 3.5))
}