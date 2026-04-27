package id.ac.polbeng.depandi.test_kelas

class StudentF(
    firstName: String,
    lastName: String
) : PersonF(firstName, lastName)

fun main() {
    val s = StudentF("Budi", "Gunawan")
    println("Name: ${s.firstName} ${s.lastName}")
}