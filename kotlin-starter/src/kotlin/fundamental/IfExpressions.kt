package kotlin.fundamental

fun main(args: Array<String>) {
    val openHours = 7
    val now = 7
    val office: String
    if (now > openHours) {
        office = "Office already open"
    } else if (now == openHours) {
        office = "Wait a minute, office will be opened soon"
    } else {
        office = "Office is closed"
    }

    println(office)

    /*
    Perlu diketahui bahwa Kotlin tidak mendukung ternary operator (condition ? then : else), karena peran dari operator tersebut sudah digantikan dengan if expressions.
     */
}