package id.ac.polbeng.depandi.test_kelas

class Teacher : PersonA("Budi", "Gunawan", 30)

fun main() {
    val t = Teacher()
    println("${t.firstName} ${t.lastName} ${t.age}")
}