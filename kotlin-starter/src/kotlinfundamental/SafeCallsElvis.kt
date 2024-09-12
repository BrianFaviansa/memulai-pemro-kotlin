package kotlinfundamental

fun main() {
//  Safe Calls
    val text: String? = null
    val textLength = text?.length

//  Elvis Operator
    val textLength2 = text?.length ?: 7
//  Kode diatas sama dengan
    val textLength3 = if (text !== null) text.length else 7
}