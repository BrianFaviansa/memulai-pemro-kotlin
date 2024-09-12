package controlflow

fun main() {
    val rangeInt = 1..10 step 2
    println(rangeInt)
    rangeInt.forEach {
        println("$it")
    }

    val rangeInt2 = 1.rangeTo(10)
    val rangeInt3 = 10.downTo(1)

    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("7 is available in ten to one")
    }

    if (11 !in tenToOne) {
        println("No value 11 in Range ten to one")
    }
}