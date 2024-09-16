package kotlinfuncpro

fun main() {

}

// INNER FUNCTION
//fun setWord(message: String) {
//    fun printMessage(text: String) {
//        println(text)
//    }
//    printMessage(message)
//}

// inner function dapat mengakses bagian fungsi luarnya
fun setWord(message: String) {
    // printMessage() // ERROR: Unresolved references
    fun printMessage() {
        println(message)
    }
    printMessage()
}
// inner function hanya bisa diakses setelah fungsi tersebut didefinisikan (di bawahnya)

// INNER FUNCTION UNTUK MENCEGAH MENULIS KODE YG SAMA BERULANG KALI
//fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
//    fun validateNumber(value: Int) {
//        if(value == 0) {
//            throw IllegalArgumentException("Value must be better than 0")
//        }
//    }
//
//    validateNumber(valueA)
//    validateNumber(valueB)
//    validateNumber(valueC)
//
//    return valueA + valueB + valueC
//}

// INNER FUNCTION SEBAGAI EXTENSION FUNCTION
fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun Int.validateNumber() {
        if(this == 0) {
            throw IllegalArgumentException("Value must be better than 0")
        }
    }

    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    return valueA + valueB + valueC
}