package kotlinoop
//
//fun main() {
//    val cat1 = Cat("Hibou", 1.6, 4, true, "Blue", 2)
//    cat1.playWithHuman()
//    cat1.eat()
//    cat1.sleep()
//}
//
//open class Animal(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {
//    open fun eat() {
//        println("$name sedang makan")
//    }
//
//    open fun sleep() {
//        println("$name sedang tidur")
//    }
//}
//
//class Cat(
//    pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int
//) : Animal(pName, pWeight, pAge, pIsCarnivore) {
//    fun playWithHuman() {
//        println("$name bermain dengan manusia")
//    }
//
//    override fun eat() {
////      untuk menambahkan implementasi, gunakan keyword super
//        super.eat()
//        println("$name sedang makan makanan kucing")
//    }
//
//    override fun sleep() {
//        println("$name sedang tidur di bantal")
//    }
//}