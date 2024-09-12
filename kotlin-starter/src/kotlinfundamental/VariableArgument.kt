package kotlinfundamental

fun main() {
    val sum1 = sumNumbers(1, 2, 3, 4, 5)
    println(sum1)

    val size1 = getNumbersSize(1, 2, 3, 4, 5)
    println(size1)

    /*
        Aturan vararg
        1. tidak boleh lebih dari 1
        2. letakkan di posisi terakhir, jika tidak di posisi terakhir maka ketika mengirim argumen selain untuk vararg harus dengan named argument
           contoh :
           fun main() {
            sets(10, 10, name = "Kotlin")
            }

            fun sets(vararg number: Int, name: String): Int {
                ...
            }
     */

//    vararg vs array

    val number = arrayOf(10, 20, 30, 40)
    sets(number)

//    kita bisa memasukkan argumen satu persatu. Lalu apakah bisa kita memasukkan nilai yang sudah berbentuk Array sebagai argumen untuk parameter yang ditandai dengan vararg? Tentu bisa! Dengan memanfaatkan spread operator (*) seperti berikut.
    val numbersLagi = intArrayOf(10, 20, 30, 40)
    sets2(10, 20, *numbersLagi, 50)
}

fun sumNumbers(vararg numbers: Int): Int {
    return numbers.sum()
}

fun getNumbersSize(vararg numbers: Int): Int {
    return numbers.size
}

fun sets(number: Array<Int>) {

}

fun sets2(vararg numbers: Int) {

}