package kotlinfuncpro

fun main() {

}

// FACTORIAL DGN FOR LOOP
//fun factorial(n: Int): Int {
//    return if (n == 1) {
//        n
//    } else {
//        var result = 1
//        for (i in 1..n) {
//            result *= i
//        }
//        result
//    }
//}

// DGN REKURSIF
//fun factorial(n: Int): Int {
//    return if (n == 1) {
//        n
//    } else n * factorial(n - 1)
//}

// TAIL CALL RECURSION
tailrec fun factorial(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial(n - 1, newResult)
    }
}