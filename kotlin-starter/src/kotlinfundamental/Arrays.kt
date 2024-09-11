package kotlinfundamental

fun main() {
    val array = arrayOf(1, 3, 5 ,7)
    val mixArray = arrayOf(1, 3, "Dicoding", true, 2.5)

    /*
        Array dengan tipe data primitif :
        intArrayOf() : IntArray
        booleanArrayOf() : BooleanArray
        charArrayOf() : CharArray
        longArrayOf() : LongArray
        shortArrayOf() : ShortArray
        byteArrayOf() : ByteArray
     */

    val intArray = arrayOf(1, 2, 3)
    println(intArray[2])
    intArray[1] = 5
    for (element in intArray) {
        print("$element ")
    }
}