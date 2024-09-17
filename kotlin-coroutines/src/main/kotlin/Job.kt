package org.example

import kotlinx.coroutines.*

// menjalankan job dengan start
//fun main() = runBlocking {
//    val job = launch(start = CoroutineStart.LAZY) {
//        delay(1000L)
//        println("Start new job!")
//    }
//    job.start()
//    println("Other task")
//}

// menjalankan job dengan join
//fun main() = runBlocking {
//    val job = launch(start = CoroutineStart.LAZY) {
//        delay(1000L)
//        println("Start new job!")
//    }
//    job.join()
//    println("Other task")
//}

/*
Perbedaan dari keduanya adalah bahwa yang start() akan memulai job tanpa harus menunggu job tersebut selesai, sedangkan join() akan menunda eksekusi sampai job selesai
 */

// membuat job dengan launch()
//fun main() = runBlocking {
//    val job = launch {
//        // background task here
//    }
//}

// membuat job dengan Job()
//fun main() = runBlocking {
//    val job = Job()
//}

// membuat job tanpa langsung menjalankannya
//fun main() = runBlocking {
//    val job = launch(start = CoroutineStart.LAZY) {
//        TODO("Not implemented yet!")
//    }
//}
