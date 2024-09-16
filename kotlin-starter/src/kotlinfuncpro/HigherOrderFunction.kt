package kotlinfuncpro

fun main() {
//    printResult(12, sum)

//    printResult(20, { value ->
//        value + value
//    })

    // JIKA PARAMETER TERAKHIR ADALAH LAMBDA
    printResult(15) {value ->
        value + value
    }

    printResult(10){ value ->
        value + value
    }
    printResult(20){ value ->
        value + value
    }
}

//fun printResult(value: Int, sum: (Int) -> Int) {
//    val result = sum(value)
//    println(result)
//}

//var sum: (Int) -> Int = { value -> value + value }

//fun printResult(value: Int, sum: (Int) -> Int) {
//    val result = sum(value)
//    println(result)
//}

inline fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}