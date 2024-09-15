package specialclasscollection

fun main(args: Array<String>) {
    // slice
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6)
    val slice2 = total.slice(3..6 step 2)
    println(slice)
    println(slice2)

    val index = listOf(2, 3, 5, 8)
    val total2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice3 = total2.slice(index)

    println(slice3)

    // distinct
    val total3 = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total3.distinct()
    println(distinct)

    // distinct data class
    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )
    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

    // distinctBy
    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinct2 = text.distinctBy {
        it.length
    }

    println(distinct2)
    // fungsi distinct() tidak dapat digunakan pada object Map Collection.

    // chunked
    val word = "QWERTY"
    val chunked = word.chunked(2)
    println(chunked)
    val chunkedTransform = word.chunked(3){
        it.toString().lowercase()
    }
    println(chunkedTransform)
}

data class Item(val key: String, val value: Any)