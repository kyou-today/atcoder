package abc158

import int
import string
import stringList

fun main(args: Array<String>) {
    var head = mutableListOf<Char>()
    var tail = string().toMutableList()
    val Q = int()
    repeat(Q) {
        val query = string().split(" ")
        val T = query[0].toInt()
        if(T == 1) {
            val tmp = head
            head = tail
            tail = tmp
        }else{
            val F = query[1].toInt()
            val C = query[2].first()
            if(F == 1) {
                head.add(C)
            }else{
                tail.add(C)
            }
        }
    }

    val res = head.joinToString("").reversed() + tail.joinToString("")
    println(res)
}