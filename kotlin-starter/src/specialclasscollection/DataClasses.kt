package specialclasscollection
//
//fun main() {
//    val user1 = User("Hibou", 20)
//    val dataUser1 = DataUser("Bebou", 20)
//    val dataUser2 = DataUser("Bebou", 20)
//    val dataUser3 = DataUser("Hibou", 20)
//
//    println(user1.toString())
//    println(dataUser1)
//
//    println(dataUser1.equals(dataUser2))
//    println(dataUser1.equals(dataUser3))
//
////    jika equals dipakai pada yang bukan data class, konsol selalu menghasilkan false
////    karena yg dibandingkan bukan kontennya, tetapi lokasi objek di memory
//}
//
//class User(val name: String, val age: Int) {
//    override fun toString(): String {
//        return "User(name=$name, age=$age)"
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (javaClass != other?.javaClass) return false
//
//        other as User
//
//        if (name != other.name) return false
//        if (age != other.age) return false
//
//        return true
//    }
//
//    override fun hashCode(): Int {
//        var result = name.hashCode()
//        result = 31 * result + age
//        return result
//    }
//}
//
//data class DataUser(val name: String, val age: Int)
//
