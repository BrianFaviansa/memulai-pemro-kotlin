package controlflow

fun main() {
//  For dapat digunakan pada Ranges, Collections, Arrays dan apa pun yang menyediakan iterator

    val ranges = 1..5
    for (i in ranges) {
        print("$i ")
    }

    println()

    val ranges2 = 1..15 step 3
    for ((index, i) in ranges2.withIndex()) {
        println("$i with index $index")
    }

    val values = 1..10 step 2
    values.forEach { value ->
        println("value is $value")
    }
}