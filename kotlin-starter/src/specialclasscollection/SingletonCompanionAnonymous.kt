package specialclasscollection
//
//interface IFly {
//    fun fly()
//}
//
//fun flyWithWings(bird: IFly) {
//    bird.fly()
//}
//

//fun interface IFly {
//    fun fly()
//}
//
//fun flyWithWings(bird: IFly) {
//    bird.fly()
//}
//
//fun main() {
//    flyWithWings {
//        println("The Bird is flying")
//    }
//}

//    CentralLibrary.borrowBookById(5)
//    Library.Companion.borrowBookById(21)
//    Library.borrowBookById(21)
//    val name = MyLibrary.LIBRARY_NAME
//    println(name)

//    flyWithWings(object : IFly {
//        override fun fly() {
//            println("Bird is flying")
//        }
//    })
//}
//
//
//// singleton object
////object CentralLibrary {
////    fun borrowBookById(id: Int) {
////        println("Book with id $id has been removed")
////    }
////}
//
//// companion object
////class Library {
////    companion object{
////        fun borrowBookById(id: Int) {
////            println("Book with $id has been borrowed")
////        }
////    }
////}
//
////class MyLibrary {
////    // Const 'val' are only allowed on top level, in named objects, or in companion objects
////    // const val LIBRARY_NAME = "Dicoding Library"
////
////    fun totalBook() {
////        print("Total book in $LIBRARY_NAME is unlimited")
////    }
////
////    companion object{
////        const val LIBRARY_NAME = "Dicoding Library"
////    }
////}
//
//// anonymous class
//
//
////class Bird : IFly {
////    override fun fly() {
////        println("The Bird flying")
////    }
////}

// contoh ketika di dunia pemrograman android
//myButton.setOnClickListener(object : OnClickListener{
//    override fun onClick(p0: View?) {
//        //melakukan perintah tertentu
//    }
//})
////menggunakan SAM Interface
//myButton.setOnClickListener {
//    //melakukan perintah tertentu
//}
