package specialclasscollection
//
//fun main() {
////    val colorRed = Color.RED
////    val colorGreen = Color.GREEN
////    val colorBlue = Color.BLUE
////
////    val colors: Array<Color> = Color.values()
////    colors.forEach { color ->
////        print("$color ")
////    }
////
////    println()
////    val color: Color = Color.valueOf("RED")
////    println("Color is $color")
////    println("Color value is ${color.value.toString(16)}")
//
////    val colors: Array<Color> = enumValues()
////    colors.forEach { color ->
////        println(color)
////    }
////
////    val color: Color = enumValueOf("RED")
////    println("Color is $color")
////    val color2: Color = Color.BLUE
////    println("Blue position is ${color2.ordinal}")
//
//    val color: Color = Color.GREEN
//
//    when(color){
//        Color.RED -> print("Color is Red")
//        Color.BLUE -> print("Color is Blue")
//        Color.GREEN -> print("Color is Green")
//    }
//}
//
//enum class Color(val value: Int) {
//    RED(0xFF0000) {
//        override fun printValue() {
//            println("value of RED is $value")
//        }
//    },
//    GREEN(0x00FF00) {
//        override fun printValue() {
//            println("value of GREEN is $value")
//        }
//    },
//    BLUE(0x0000FF) {
//        override fun printValue() {
//            println("value of BLUE is $value")
//        }
//    };
//
//    abstract fun printValue()
//}