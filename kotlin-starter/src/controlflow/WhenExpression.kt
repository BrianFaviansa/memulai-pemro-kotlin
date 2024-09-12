package controlflow

import kotlin.random.Random

fun main() {
    val value = 10

    when (value) {
        6 -> println("Value is 6")
        7 -> println("Value is 7")
        8 -> println("Value is 8")
        else -> println("Invalid Value")
    }
}

fun main2() {
    val value = 7
    val stringOfValue = when (value) {
        6 -> {
            println("Six")
            "value is 6"
        }

        7 -> {
            println("Seven")
            "value is 7"
        }

        8 -> {
            println("Eight")
            "value is 8"
        }

        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    println(stringOfValue)
}

fun main3() {
    val anyType: Any = 100L
    when (anyType) {
        is Long -> println("Long")
        is Int -> println("Int")
        is String -> println("String")
        else -> println("Invalid Type")
    }
}

fun main4() {
    val value = 27
    val ranges = 10..50

    when (value) {
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
    }
}

fun main5() {
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
}

fun getRegisterNumber() = Random.nextInt(100)
