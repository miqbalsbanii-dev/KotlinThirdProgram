package id.ac.polbeng.depandi.test_kelas

open class Shape {
    open fun draw() {
        println("Drawing shape")
    }
}

class Circle : Shape() {
    override fun draw() {
        println("Drawing circle")
    }
}

class Square : Shape() {
    override fun draw() {
        println("Drawing square")
    }
}

fun main() {
    val shapes = listOf(Shape(), Circle(), Square())

    for (s in shapes) {
        s.draw()
    }
}