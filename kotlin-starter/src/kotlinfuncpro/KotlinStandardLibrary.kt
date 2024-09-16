package kotlinfuncpro

fun main() {
    // LAMBDA RECEIVER (THIS)
//    val buildString = StringBuilder().apply {
//        append("Hello ")
//        append("Kotlin ")
//    }
//    println(buildString)

    // LAMBDA ARGUMENT (IT)
//    val text = "Hello"
//    text.let {
//        val message = "$it Kotlin"
//        println(message)
//    }

    // nama default adalah it, namun dapat diubah seperti contoh di bawah
//    val text2 = "Hello2"
//    text2.let { value ->
//        val message = "$value Kotlin"
//        println(message)
//    }


    // 5 SCOPE FUNCTION
    // apply: Menginisialisasi objek dan mengatur propertinya, kemudian mengembalikan objek tersebut
//    val personApply = Person("John", 25).apply {
//        println("apply: Initializing $name, age $age")
//    }

// also: Melakukan tindakan tambahan pada objek dan mengembalikan objek tersebut
//    val personAlso = Person("Jane", 30).also {
//        println("also: Initializing ${it.name}, age ${it.age}")
//    }

// let: Melakukan operasi pada objek dan mengembalikan hasil operasi tersebut
//    val personLet = Person("Bob", 22).let {
//        println("let: Initializing ${it.name}, age ${it.age}")
//        "Result: ${it.name} is ${it.age} years old" // return value
//    }
//    println("let result: $personLet")

// run: Menjalankan blok kode pada objek dan mengembalikan hasil blok kode tersebut
//    val personRun = Person("Alice", 28).run {
//        println("run: Initializing $name, age $age")
//        "Result: $name is $age years old" // return value
//    }
//    println("run result: $personRun")

// with: Menggunakan objek sebagai receiver untuk blok kode dan mengembalikan hasil blok kode tersebut
//    val personWithResult = with(Person("Charlie", 35)) {
//        println("with: Initializing $name, age $age")
//        "Result: $name is $age years old" // return value
//    }

}