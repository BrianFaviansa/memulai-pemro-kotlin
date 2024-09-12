package controlflow

fun main() {
    var counter = 1
    while (counter <= 7) {
        println(counter)
        counter++
    }

    var counter2 = 8
    do {
        println("Hello, World!")
        counter++
    } while (counter2 < 7)
}