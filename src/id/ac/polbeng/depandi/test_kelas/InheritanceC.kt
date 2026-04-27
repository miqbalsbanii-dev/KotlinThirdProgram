package id.ac.polbeng.depandi.test_kelas

class StudentC(
    firstName: String,
    lastName: String,
    age: Int
) : PersonC(firstName, lastName, age)

fun main() {
    val s = StudentC("Budi", "Gunawan", 21)
    println("${s.firstName} ${s.lastName} ${s.age}")
}