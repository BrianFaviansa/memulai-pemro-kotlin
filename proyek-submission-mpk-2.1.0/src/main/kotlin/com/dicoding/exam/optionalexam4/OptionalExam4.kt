package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    val stringLength = string.length
    val mid = stringLength / 2

    return if (stringLength % 2 == 0) {
        string.substring(mid - 1, mid + 1)
    } else {
        string[mid].toString()
    }
}