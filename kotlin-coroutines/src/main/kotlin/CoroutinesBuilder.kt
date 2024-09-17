package org.example

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val timeNormal = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
    }

    // dengan async await
    val timeWithAsyncAwait = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await() - capital.await()}")
    }

    println("Time normal : $timeNormal ms\nTime async await: $timeWithAsyncAwait ms")
}

suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}