package id.ac.polbeng.depandi.test_kelas

open class PersonE {

    var firstName: String
    var lastName: String
    var age: Int = 25

    constructor(firstName: String, lastName: String) {
        this.firstName = firstName
        this.lastName = lastName
    }

    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = age
    }
}