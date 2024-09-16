package kotlinfuncpro

typealias Arithmetic = (Int, Int) -> Int
// nullable
//typealias Arithmetic = ((Int, Int) -> Int)?

fun main() {
    val sum: Arithmetic = {valueA, valueB -> valueA + valueB}
    val multiply: Arithmetic = {valueA, valueB -> valueA * valueB}

//    val sumResult = sum.invoke(1, 2)
//    val multiplyResult = multiply.invoke(2, 2)

    val sumResult = sum(10, 10)
    val multiplyResult = multiply(20, 20)

    // nullable
//    val sumResult = sum?.invoke(10, 10)

}
