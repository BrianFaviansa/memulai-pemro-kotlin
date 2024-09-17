package kotlingenerics

fun main() {
//    val car = Car(200)
//    val motorCycle = MotorCycle(100)
//    var vehicle: Vehicle = car
//    vehicle = motorCycle
//
//    val carList = listOf(Car(150), Car(50))
//    val vehicleList = carList
}

//abstract class Vehicle(wheel: Int)
//class Car(speed: Int) : Vehicle(4)
//class MotorCycle(speed: Int) : Vehicle(2)

// COVARIANT
//interface List<out E> : Collection<E> {
//    operator fun get(index: Int): E
//}

// CONTRAVARIANT
interface comparable<in T> {
    operator fun compareTo(other: T): Int
}

