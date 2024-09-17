package kotlingenerics

fun main() {
    var longArrayList = ArrayList<Long>()
    var firstLong = longArrayList[0]


}

//interface List<T> {
//    operator fun get(index: Int): T
//}

class LongList: List<Long> {
    override fun get(index: Int): Long {
        return this[index]
    }
}

// MEMBUAT LONGLIST DIATAS MENJADI GENERIC
class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

// BISA GUNAKAN SELAIN T, NAMUN ITU CONVENTION NAME
interface List<P> {
    operator fun get(index: Int): P
}