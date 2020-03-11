package abc158

import longList

fun main(args: Array<String>) {
    val (N, A, B) = longList()

    val t = N % (A + B)
    val c = N / (A + B)
    if(t == 0L) {
        println(A * c)
    }else{
        if(t > A) {
            println(A * c + (t - A))
        }else{
            println(A * c + t)
        }
    }
}