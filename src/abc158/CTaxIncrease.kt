package abc158

import intList
import java.lang.Math.floor

fun main(args: Array<String>) {
    val (A, B) = intList().map(Int::toDouble)
    // v * 0.08 = A
    // v * 0.10 = B

    for(i in 1..1009) {
        val c = floor(i * 0.08)
        val d = floor(i * 0.10)
        if(A == c && B == d) {
            println(i)
            return
        }
    }
    println(-1)
}