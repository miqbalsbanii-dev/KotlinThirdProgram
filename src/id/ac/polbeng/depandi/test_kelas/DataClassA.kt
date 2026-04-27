package id.ac.polbeng.depandi.test_kelas

data class User(val name: String, val age: Int)

fun main() {
    val user1 = User("Budi", 21)
    val user2 = User("Budi", 21)

    println(user1)
    println(user1 == user2)
}