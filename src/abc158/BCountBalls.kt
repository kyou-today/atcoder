package abc158

import longList
import java.lang.Math.min

fun main(args: Array<String>) {
    val (N, A, B) = longList()

    val res = N / (A + B) * A
    val c = N % (A + B)
    println(res + min(c, A))
}