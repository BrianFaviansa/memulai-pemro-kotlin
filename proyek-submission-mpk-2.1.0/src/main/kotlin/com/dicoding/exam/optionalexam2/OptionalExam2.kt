package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val numbers = number.toString().map { it.toString().toInt() }
    val minDigit = numbers.minOrNull() ?: throw IllegalArgumentException("Invalid input")
    val maxDigit = numbers.maxOrNull() ?: throw IllegalArgumentException("Invalid input")
    return minDigit + maxDigit
}
