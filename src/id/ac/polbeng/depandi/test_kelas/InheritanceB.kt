package id.ac.polbeng.depandi.test_kelas

class StudentB(
    firstName: String,
    lastName: String,
    age: Int
) : PersonB(firstName, lastName, age)

fun main() {
    val s = StudentB("Budi", "Gunawan", 21)
    println("${s.firstName} ${s.lastName} ${s.age}")
}