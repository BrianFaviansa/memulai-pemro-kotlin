package kotlinfundamental

fun main() {
    val text = "Dicoding"
    val fourthChar = text[3]
    println("The 4th character of the $text is $fourthChar")

    val text2 = "Kotlin"
    for (char in text2) {
        print("$char ")
    }

    println()

//    Escaped String
    val statement = "Kotlin is \"Awesome\""
    println(statement)

    /*
        \t: menambah tab ke dalam teks.
        \n: membuat baris baru di dalam teks.
        \’: menambah karakter single quote kedalam teks.
        \”: menambah karakter double quote kedalam teks.
        \\: menambah karakter backslash kedalam teks.
     */

//    Raw String
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(line)
}