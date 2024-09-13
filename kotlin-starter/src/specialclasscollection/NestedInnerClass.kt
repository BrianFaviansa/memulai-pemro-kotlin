package specialclasscollection

fun main() {
//    val room1 = House.Room()
    val house = House()
    val room = house.Room()
    // Perhatikan bahwa untuk mengakses fungsi yang di dalam inner class, Anda perlu menginisialisasi outer class terlebih dahulu.
    room.measureRoomArea()
}

class House {
    val buildingArea = 100
    val totalRooms = 4

    inner class Room { // Inner class dapat mengakses properti pada outer class
        val totalRooms = 4
        fun measureRoomArea() {
            // member class tidak dapat mengakses properti pada outer class, harus ditambahi keyword inner
            println(buildingArea/this@House.totalRooms)
        }
    }
}