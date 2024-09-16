package kotlinfuncpro

fun main() {
    // LET
//    val message: String? = null
//    message?.let {
//        val length = it.length * 2
//        val text = "text length $length"
//        println(text)
//    }

    // LET + RUN + ELVIS OPERATOR
//    val message: String? = null
//    message?.let {
//        val length = it.length * 2
//        val text = "text length $length"
//        println(text)
//    } ?: run {
//        val text = "message is null"
//        println(text)
//    }

    // ALSO
    val text = "Halo Hibou"
    val result = text.also {
        println("value length => ${it.length}")
    }

    println("text => $result")
}