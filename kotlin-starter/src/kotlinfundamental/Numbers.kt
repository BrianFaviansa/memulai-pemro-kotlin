package kotlinfundamental

fun main() {
    val intNumber = 100
    val longNumber: Long = 100
    val longNumber2 = 100L
    val shortNumber: Short = 10
    val byteNumber: Byte = 8
    val doubleNumber = 7.5
    val floatNumber = 0.12345678F

//    melakukan cek min dan max value pada tipe number
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE
    println("Max Int value : $maxInt")
    println("Min Int value : $minInt")

//    Operator Matematika
    val numberOne = 1
    val numberTwo = 2

    println(numberOne + numberTwo)

    val nomorSatu: Int = 27
    val nomorDua: Int = 10
    println(nomorSatu / nomorDua)

//    Konversi tipe data number
    val byteNumber2: Byte = 10
    val intFromByte: Int = byteNumber.toInt()

    /*
        toByte(): Byte
        toShort(): Short
        toInt(): Int
        toLong(): Long
        toFloat(): Float
        toDouble(): Double
        toChar(): Char
     */

//    Konversi tipe data dalam expression
    val stringNumber = "23"
    val intNumber3 = 3

    println(intNumber3 + stringNumber.toInt())

//    Nilai numerik yang readable
    val readableNumber = 1_000_000
    println(readableNumber)
}