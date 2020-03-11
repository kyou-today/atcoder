package abc158

import string

fun main(args: Array<String>) {
    val s = string().toCharArray()

    if(s[0] == s[1] && s[1] == s[2]) {
        println("No")
    }else{
        println("Yes")
    }
}