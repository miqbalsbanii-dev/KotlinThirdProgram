package id.ac.polbeng.depandi.test_kelas

open class EmployeeB {
    open fun work() {
        println("Employee working")
    }
}

class ManagerB : EmployeeB() {
    override fun work() {
        println("Manager managing")
    }
}

class DeveloperB : EmployeeB() {
    override fun work() {
        println("Developer coding")
    }
}

fun main() {
    val employees = listOf(EmployeeB(), ManagerB(), DeveloperB())

    for (e in employees) {
        e.work()
    }
}