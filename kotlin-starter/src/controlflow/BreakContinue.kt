package controlflow

fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) {
            continue
        }
        println(i)
    }

//  Break dan Continue labels
    loop@ for (i in 1..10) {
        println("Outside Loop")
        for (j in 1..10) {
            println("Inside Loop")
            if (j >= 5) break@loop
        }
    }
}