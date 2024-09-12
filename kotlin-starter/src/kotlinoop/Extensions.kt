package kotlinoop
//
//fun main() {
//    10.printInt()
//    println(10.plusThree())
//
//    println(10.slice)
//
//    val result = 6.sum(4)
//    println(result)
//
//    val result2 = 6 substract 4
//    println(result2)
//}
//
////    Extension functions
////    receiver type.fungsi baru
//fun Int.printInt() {
//    println("value is $this")
//}
//
//fun Int.plusThree(): Int {
//    return this + 3
//}
//
//// Extension properties
//val Int.slice: Int
//    get() = this / 2
//// Extension properties hanya bisa dideklarasikan dengan cara menyediakan getter atau setter secara eksplisit. karena tidak benar" mengubah sebuah class
//
//// Infix function
//fun Int.sum(value: Int): Int {
//    return this + value
//}
//
//// dengan keyword infix
//infix fun Int.substract(value: Int): Int {
//    return this - value
//}
//
///*
//syarat untuk menggunakan infix function :
//    Infix function harus merupakan sebuah member function atau extension function.
//    Harus memiliki satu parameter saja.
//    Parameter tidak boleh berupa generic dan tidak memiliki nilai default.
// */
//
////class MyHero {
////    infix fun addHero(s: String) { /*...*/ }
////
////    fun build() {
////        this addHero "Superman"   // Correct
////        addHero("Spidermen")       // Correct
////        //  addHero "Ironman"        // Incorrect: the receiver must be specified
////    }
////}