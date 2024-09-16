package kotlinfuncpro

fun main(args: Array<String>) {
    // imperative
//    val list = getListUser()
//
//    fun getUsername(): List<String>{
//        val name = mutableListOf<String>()
//        for (user in list){
//            name.add(user.name)
//        }
//        return name
//    }

    // funcpro
//    fun getUsername(): List<String>{
//        return list.map {
//            it.name
//        }
//    }

//    println(name())
//    println(name("Bebou"))

//    printName("Bebou") { value ->
//        val last = "Academy"
//
//        "$value $last"
//    }

//    val hibou = "Hibou".firstAndLast()
//    println(hibou)

//    val hibou = "Hibou".firstAndLast
//    println(hibou)

    // SCOPE FUNCTION
//    val hibou = StringBuilder()
//    hibou.apply {
//        append("Hibou")
//        append(" Academy")
//    }
//
//    println(hibou.toString())

    // COLLECTION FUNCTION
    val dicoding = 1..10
    println(dicoding.take(3))

//    Lambda philip lackner
//    var list = (1..20).toList()
//    println(list)
//    list = list.filter { it % 2 == 0 }
//    println(list)
}

// LAMBDA
//val name = {
//    val first = "Hibou"
//    val last = "Academy"
//    "$first $last"
//}

//val name: (String) -> String = { value ->
//    val last = "Academy"
//
//    "$value $last"
//}

// HIGHER ORDER FUNCTION
//fun printName(value: String, name: (String) -> String) {
//    println(name(value))
//}

// EXTENSIONS FUNCTION
//fun String.firstAndLast(): Map<String, Char> {
//    return mapOf(
//        "first" to first(),
//        "last" to last()
//    )
//}

// EXTENSIONS PROPERTY
//val String.firstAndLast: Map<String, Char>
//    get() = mapOf(
//        "first" to first(),
//        "last" to last()
//    )