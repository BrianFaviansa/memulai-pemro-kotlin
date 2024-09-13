package kotlinoop

fun main() {
//  arithmetic exception
    val someValue = 6
    println(someValue / 0)

//  number format exception
    val someStringValue = "18.0"
    println(someStringValue.toInt())

//  NullPointerException
    val someNullValue: String? = null
    val someMustNotNullValue: String = someNullValue!!
    println(someMustNotNullValue)
}