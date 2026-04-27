package id.ac.polbeng.depandi.test_kelas

open class Animal {
    open fun sound() {
        println("Animal makes a sound")
    }
}

class Dog : Animal() {
    override fun sound() {
        println("Dog barks")
    }
}

class Cat : Animal() {
    override fun sound() {
        println("Cat meows")
    }
}

fun main() {
    val animals = listOf(Animal(), Dog(), Cat())

    for (a in animals) {
        a.sound()
    }
}