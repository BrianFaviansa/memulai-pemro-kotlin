package kotlinfundamental

fun main() {
    val user = setUser("Hibou", 20)
    println(user)

    printUser("Bebou")
}

//fun setUser(name: String, age: Int): String {
//    return "Your name is $name and age is $age years old"
//}

fun setUser(name: String, age: Int): String = "Your name is $name and age is $age years old"

fun printUser(name: String): Unit {
    println("Your name is $name")
}