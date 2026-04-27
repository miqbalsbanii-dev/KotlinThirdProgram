package id.ac.polbeng.depandi.test_kelas

fun main() {
    val greeter = Greeter() // Kalau ini merah, berarti Greeter.kt belum di-save atau beda package
    greeter.greet()
    greeter.text = "Hi"
    greeter.greet("Anton")
    greeter.greet("Budi")
    greeter.text = "Hello programmer"
    println(greeter.with_ret_val("Dono"))
}