package kotlinfuncpro

fun main() {
//    val message: (String) -> String = { name: String -> "Hello $name" }

    // menggunakan lambda expression
//    message()

//    printMessage("Hallo Hibou")

//    val length = messageLength("Hello from Hibou Gaming")
//    println(length)

// PERULANGAN DENGAN LAMBDA
    val ranges = 1.rangeTo(15) step 3

//    ranges.forEach { value ->
//        println("Value is $value")
//    }

    ranges.forEachIndexed { index, value ->
        println("Value $value at index $index")
    }

// JIKA HANYA INGIN MENDAPATKAN INDEX
//    val ranges = 1.rangeTo(10) step 3
//    ranges.forEachIndexed { index, _ ->
//        println("index $index")
//    }

}

//val message = { println("Hello from lambda expression") }

// DENGAN PARAMETER
//val printMessage = { message: String -> println(message) }

// LAMBDA MERETURN NILAI
//val messageLength = { message: String -> message.length }


