package specialclasscollection

fun main() {
    val list = (1..10000).toList()
    // val number = list.filter { it % 5 == 0 }.map { it * 2 }.first()
    val number = list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.first()
    println(number)

    val sequenceNumber = generateSequence(1) { it + 2 }
    sequenceNumber.take(20).forEach { print("$it ") }
}