package id.ac.polbeng.depandi.test_kelas

class EmployeeA(_id: Int, _name: String, _age: Int) {

    val id: Int = _id

    var name: String = _name
        get() = field.uppercase()

    var age: Int = _age
        set(value) {
            field = if (value > 0) value
            else throw IllegalArgumentException("Age must be greater than zero")
        }
}

fun main() {
    val emp = EmployeeA(1101, "Jono", 25)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")


    emp.age = -1
}