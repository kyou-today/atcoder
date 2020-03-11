package abc158

import int
import string
import stringList

fun main(args: Array<String>) {
    val S = string()
    val Q = int()

    val res = buildString {
        append(S)

        repeat(Q) {
            val query = stringList()
            val T = query[0].toInt()
            if(T == 1) reverse()
            else {
                val F = query[1].toInt()
                if(F == 1) insert(0, query[2])
                else append(query[2])
            }
        }
    }

    println(res)
}