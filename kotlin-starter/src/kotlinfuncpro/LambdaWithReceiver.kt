package kotlinfuncpro

fun main() {
    val message = buildString {
        append("Hello")
        append(" From ")
        append("Lambda")
    }
    println(message)
}

// LAMBDA WITH RECEIVER
fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}