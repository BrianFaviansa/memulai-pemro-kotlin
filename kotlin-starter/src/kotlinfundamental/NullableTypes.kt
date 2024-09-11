package kotlinfundamental

fun main() {
    val text: String? = null

    var string: String? = "Dicoding"
    if(string !== null) {
        println(string.length)
    }

    var obj: Any = "Dicoding"
//    var obj = 2
    if(obj is String) {
        println("Object is String with length of ${obj.length}")
    } else {
        println("Object is not String")
    }
}