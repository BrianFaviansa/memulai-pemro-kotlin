package kotlinfundamental

fun main() {
//    Conjunction atau AND (&&)
    val officeOpen = 7
    val officeClosed = 17
    val now = 15

//    val isOpen = if(now >= officeOpen && now <= officeClosed) {
//        true
//    } else {
//        false
//    }
//    println(isOpen)

//    menyederhanakan if else diatas
    val isOpen = now >= officeOpen && now <= officeClosed
    println("Office is open : $isOpen")

//    Disjunction atau OR (||)
    val isClose = now < officeOpen || now > officeClosed
    println("Office is closed : $isClose")

//    Negation atau NOT (!)
    if (!isOpen) {
        println("Office is closed, come back tomorrow")
    } else {
        println("Office is open, happy working")
    }
}