package org.example

import kotlinx.coroutines.*

fun main() = runBlocking {
    val capital = async { getCapitalDeferred() }
    val income = async { getIncomeDeferred() }
    println("Your profit is ${income.await() - capital.await()}")
}

suspend fun getCapitalDeferred(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncomeDeferred(): Int {
    delay(1000L)
    return 75000
}