package specialclasscollection
//
//fun main() {
//    val result = Result.Error("Oops")
//    when(result) {
//        is Result.Success -> {
//            println("Success : ${result.data}")
//        }
//        is Result.Error -> {
//            println("Error : ${result.message}")
//        }
//        is Result.Loading -> {
//            println("Loading ...")
//        }
//    }
//}
//
//sealed class Result {
//    data class Success(val data: Any) : Result()
//    data class Error(val message: String) : Result()
//    object Loading : Result()
//}