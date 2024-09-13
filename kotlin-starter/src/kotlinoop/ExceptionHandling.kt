package kotlinoop

fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai string berisi null"
    } finally {
        println(someMustNotNullValue)
    }

    //  multiple catch
//    try {
//        // Block try, menyimpan kode yang membangkitkan exception
//    } catch (e: NullPointerException) {
//        // Block catch akan terpanggil ketika terjadi NullPointerException.
//    } catch (e: NumberFormatException) {
//        // Block catch akan terpanggil ketika terjadi NumberFormatException.
//    } catch (e: Exception) {
//        // Block catch akan terpanggil ketika terjadi Exception selain keduanya.
//    } finally {
//        // Block finally akan terpanggil setelah keluar dari block try atau catch
//    }

//    penerapan multiple catch
    val someStringValue: String? = null
    var someIntValue: Int = 0
    
    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when (someIntValue) {
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}

