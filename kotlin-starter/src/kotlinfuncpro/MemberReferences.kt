package kotlinfuncpro



fun main() {
    val numbers = 1.rangeTo(10)
//    val evenNumbers = numbers.filter(::isEvenNumber)
//    val evenNumbers = numbers.filter(Int::isEvenNumber)
//    println(evenNumbers)

    println(::message.name)
    println(::message.get())

//    ::message.set("Hibou Academy")
    println(::message.get())

}

// MEMBER REFERENCES
val sum: (Int, Int) -> Int = ::count

fun count(valueA: Int, valueB: Int): Int {
    return valueA + valueB
}

// FUNCTION REFERENCES
//fun isEvenNumber(number: Int) = number % 2 == 0
// REFENCES TO EXTENSION FUNCTIONS
fun Int.isEvenNumber() = this % 2 == 0

// PROPERTY REFERENCES
//var message = "Kotlin"
val message = "Kotlin"