package specialclasscollection

fun main() {
//    val integerSet = setOf(1, 2, 4, 2, 1, 5)
//    println(integerSet)

//    val setA = setOf(1, 2, 4, 2, 1, 5)
//    val setB = setOf(1, 2, 4, 5)
//    println(setA == setB)
// Output: true
//    println(5 in setA)

//    val setC = setOf(1, 5, 7)
//    val union = setA.union(setC)
//    val intersect = setA.intersect(setC)
//
//    println("Union Set A & Set C = $union")
//    println("Intersect Set A & Set C = $intersect")

    // mutable set
//    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2] = 6 // tidak bisa mengubah mutableSet
//    mutableSet.add(6) // menambah item di akhir set
//    mutableSet.remove(1) //menghapus item yang memiliki nilai 1

    // symmetric difference
    val numbers = setOf("one", "two", "three")
    val numbers2 = setOf("three", "four")

// merge differences
    println((numbers - numbers2) union (numbers2 - numbers))
// [one, two, four]
}