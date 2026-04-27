package id.ac.polbeng.depandi.test_kelas

class StudentD : PersonD {

    constructor(firstName: String, lastName: String, age: Int)
            : super(firstName, lastName, age)
}

fun main() {
    val s = StudentD("Budi", "Gunawan", 21)
    println("${s.firstName} ${s.lastName} ${s.age}")
}