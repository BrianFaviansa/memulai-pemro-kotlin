package kotlinoop

import kotlin.random.Random
//import kotlin.math.* => untuk mengimport seluruh kelas, fungsi, dan variabel pada suatu packages gunakan *
import kotlin.math.PI
import kotlin.math.cos as cosinus
import kotlin.math.sqrt as akar

fun main() {
//    val someInt = kotlin.random.Random(0).nextInt(1, 10)
    val someInt = Random(0).nextInt(1, 10)
    println(someInt)

    println(PI)
    println(cosinus(120.0))
    println(akar(144.0))


}

// cara mengimport package

/*
    import packagename.ClassName
    import packagename.functionName
    import packagename.propertyName
 */