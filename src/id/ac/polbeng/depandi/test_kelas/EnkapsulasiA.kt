package id.ac.polbeng.depandi.test_kelas

class Employee(_id: Int, _name: String, _age: Int) {

    val id: Int = _id
    var name: String = _name
    var age: Int = _age
}

fun main() {
    val emp = Employee(1101, "Jono", 25)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")
}