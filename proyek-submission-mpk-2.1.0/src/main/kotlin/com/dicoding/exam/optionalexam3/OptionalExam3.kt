package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    require(int in 1..100) { "Integer must be between 1 and 100" }

    val nums = Regex("\\d+")
    val isMatched = nums.find(str)

    return if (isMatched != null) {
        val number = isMatched.value.toInt()
        val result = number * int
        str.replace(nums, "") + result
    } else {
        str + int
    }
}
