package kotlinfundamental

fun main() {
    val fullName = getFullName(middle = "Faviansa Putra", last = "Diasti", first = "Brian")
    println(fullName)

    val fullName2 = getFullNameDefault()
    println(fullName2)

    val fullName3 = getFullNameDefault("Dicoding")
    println(fullName3)
}

// Named argument
fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

// Default Argument
fun getFullNameDefault(
    first: String = "Kotlin",
    middle: String = "is",
    last: String = "Awesome"): String {
    return "$first $middle $last"
}