package Main

fun main(args: Array<String>) {
    val array = arrayOf(1, 2, 3)
    val array1 = arrayOf(4, 5, 6)
    var res = 0
    var res1 = 0
    for (i in array.indices) {
        res += array[i]
        res1 += array1[i]
    }
    println(res+res1)
}