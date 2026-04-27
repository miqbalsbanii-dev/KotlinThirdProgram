package id.ac.polbeng.depandi.test_kelas

class StudentE : PersonE {

    constructor(firstName: String, lastName: String)
            : super(firstName, lastName)

    constructor(firstName: String, lastName: String, age: Int)
            : super(firstName, lastName, age)
}

fun main() {
    val s = StudentE("Budi", "Gunawan", 25)

    println("Name: ${s.firstName} ${s.lastName}")
    println("Age: ${s.age}")
}