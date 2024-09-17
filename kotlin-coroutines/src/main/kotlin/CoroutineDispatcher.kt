package org.example

import kotlinx.coroutines.*

// Dispatchers.Default

// dispatcher default saat menggunakan LAUNCH & ASYNC
//fun launch() {
//    // TODO: Implement suspending lambda here
//}
//
//launch(Dispatchers.Default){
//    // TODO: Implement suspending lambda here
//}

// DISPATCHERS.IO
//launch(Dispatcher.IO){
//    // TODO: Implement algorithm here
//}

// DISPATCHERS.UNCONFINED
//fun main() = runBlocking<Unit> {
//    launch(Dispatchers.Unconfined) {
//        println("Starting in ${Thread.currentThread().name}")
//        delay(1000)
//        println("Resuming in ${Thread.currentThread().name}")
//    }.start()
//}

// SINGLE THREAD CONTEXT
//fun main() = runBlocking<Unit> {
//    val dispatcher = newSingleThreadContext("myThread")
//    launch(dispatcher) {
//        println("Starting in ${Thread.currentThread().name}")
//        delay(1000)
//        println("Resuming in ${Thread.currentThread().name}")
//    }.start()
//}

// THREAD POOL
//fun main() = runBlocking<Unit> {
//    val dispatcher = newFixedThreadPoolContext(3, "myPool")
//
//    launch(dispatcher) {
//        println("Starting in ${Thread.currentThread().name}")
//        delay(1000)
//        println("Resuming in ${Thread.currentThread().name}")
//        delay(1000)
//        println("Resuming in ${Thread.currentThread().name}")
//    }.start()
//}
