package KotlinFundamental

// main function
fun main() {
    val name = "Hibou"

//    print("Hello my name is ")
//    println(name)
//    print(if (true) "Always true" else "Always false")

    val nama: String = "Bebou"
    val umur = 20
    var alamat = "Mastrip"
    alamat = "Perumahan Mastrip"
    println("Hello nama saya $nama, umur saya $umur")

//    nullable types
    val text: String? = null

//    safe call operator => memanggil nullable dengan aman
    val textLength = text?.length
    println(textLength)

//    elvis operator => nilai default jika objek bernilai null
    val textLength2 = text?.length?: 0
    println(textLength2)

//    Collection
//    1. list => untuk menyimpan nilai bebas dengan index (boleh sama)
    val integerList = listOf(1, 2, 3, 4, 5)
    println(integerList)

//    2. set => untuk menyimpan nilai unik
    val integerSet = setOf(1, 2, 3, 4, 5, 2)
    println(integerSet)

//    3. map => untuk menympan dengan format key-value, key unik tidak (boleh sama)
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    println(capital)
    println(capital["Jakarta"])
    println(capital.getValue("New Delhi"))

//    mutable list
    val anyList = mutableListOf(1, "a", "Kotlin", true)
    anyList.add("Java")
    anyList.add(1, "Dart")
    anyList[3] = false
    anyList.remove(1)
    anyList.removeAt(1)

}