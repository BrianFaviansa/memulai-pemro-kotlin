package kotlinoop
//
//import kotlin.reflect.KProperty
//
//fun main() {
////    val animal1 = Animal()
////    animal1.name = "Opik"
////    println("Animal name : ${animal1.name}")
////
////    val person1 = Person()
////    person1.name = "John Doe"
////    println("Person name: ${person1.name}")
////
////    val hero1 = Hero()
////    hero1.name = "Gatotkaca"
////    println("Hero name : ${hero1.name}")
//
//    val animal2 = Animal2()
//    animal2.name = "PawPaw"
//    animal2.weight = 2.5
//    animal2.age = 4
//    println("Animal 2 name : ${animal2.name}")
//    println("Animal 2 weight : ${animal2.weight}")
//    println("Animal 2 age : ${animal2.age}")
//}
//
//class DelegateGenericClass {
//    private var value: Any = "Default"
//
//    operator fun getValue(classRef: Any?, property: KProperty<*>): Any {
//        println("This function is same as getter for property ${property.name} in class $classRef")
//        return value
//    }
//
//    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: Any) {
//        println("This function is same as setter for property ${property.name} in class $classRef")
//        println("Value ${property.name} from : $value will become $newValue")
//        value = newValue
//    }
//}
//
//class DelegateName {
//    private var value: String = "Default"
//
//    operator fun getValue(classRef: Any?, property: KProperty<*>): String {
//        println("This function is same as getter for property ${property.name} in class $classRef")
//        return value
//    }
//
//    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
//        println("This function is same as setter for property ${property.name} in class $classRef")
//        println("Value ${property.name} from : $value will become $newValue")
//        value = newValue
//    }
//}
//
//class Animal {
//    var name: String by DelegateName()
//}
//
//class Person {
//    var name: String by DelegateName()
//}
//
//class Hero {
//    var name: String by DelegateName()
//}
//
//class Animal2 {
//    var name: Any by DelegateGenericClass()
//    var weight: Any by DelegateGenericClass()
//    var age: Any by DelegateGenericClass()
//}