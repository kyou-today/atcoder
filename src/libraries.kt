// Libraries
fun string(): String = readLine()!!
fun int(): Int = readLine()!!.toInt()
fun long(): Long = readLine()!!.toLong()
fun stringList(): List<String> = readLine()!!.split(" ")
fun intList(): List<Int> = readLine()!!.split(" ").map(String::toInt)
fun longList(): List<Long> = readLine()!!.split(" ").map(String::toLong)

// 最大公約数(ユーグリットの互除法)
tailrec fun gcd(a: Int, b: Int): Int = when {
    a < b -> gcd(b, a)
    b == 0 -> a
    else -> gcd(b, a % b)
}

fun min(a: Int, b: Int): Int = if(a < b) a else b
fun min(a: Long, b: Long): Long = if(a < b) a else b
fun max(a: Int, b: Int): Int = if(a > b) a else b
fun max(a: Long, b: Long): Long = if(a > b) a else b