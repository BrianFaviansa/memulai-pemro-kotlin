package controlflow

fun main() {
//    statement tidak mengembalikan nilai
//    if (now > openOffice) {
//        println("Office already open")
//    } else {
//        println("Office is closed")
//    }

//  expression mengembalikan nilai
//    val office = if (now > openHours) "Office already open" else "Office is closed"
//    println(office)

//   pendeklarasian variabel termasuk statement
    val value1 = 10
    val value2 = 20

//  pemanggilan fungsi sum termasuk expression
    sum(value1, value2)

}

fun sum(value1: Int, value2: Int) = value1 + value2