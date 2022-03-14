

fun main() {
    val ints = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(davaleba1(ints))

    println(davaleba2("radar"))
}


fun davaleba1(integers: List<Int>): Int {

    var temp = 0
    var tempSize = 0

    for (i in integers.indices) {
        if (i != 0 && i % 2 == 0) {
            temp += integers[i]
            tempSize += 1
        }
    }
    var result = temp / tempSize
    return result
}

fun davaleba2(sityva: String): Boolean {
    var reverseWord = ""
    for (i in sityva.indices.reversed()) {
        reverseWord += sityva[i]
    }
    return sityva == reverseWord
}