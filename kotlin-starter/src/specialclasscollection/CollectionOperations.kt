package specialclasscollection

fun main() {
    // filter & filterNot
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }
    val oddList = numberList.filterNot { it % 2 == 0 }
    println("Even List = $evenList")
    println("Odd List = $oddList")

    // map
    val multipliedBy5 = numberList.map { it * 5 }
    println("Multiply By 5 = $multipliedBy5")

    // count
    println(numberList.count())
    println(numberList.count { it % 2 == 0 })

    // find, firstOrNull, lastOrNull
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    println("First Odd Number = $firstOddNumber")
    println("First Or Null Number = $firstOrNullNumber")

    // first & last => jika kondisi tidak terpenuhi terjadi exception
    // val moreThan10 = numberList.first { it > 10 } => menyebabkan exception

    // sum
    val total = numberList.sum()
    println(total)

    // sorted
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    val descendingSort = kotlinChar.sortedDescending()
    println(ascendingSort)
    println(descendingSort)
}