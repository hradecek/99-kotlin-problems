package sk.hradecek.kotlin.lists

fun <T> length1(list: List<T>): Int = list.map { 1 }.sum()

fun <T> length2(list: List<T>): Int {
    fun lengthRec(acc: Int, list: List<T>): Int = if (list.isEmpty()) acc else lengthRec(acc + 1, list.drop(1))
    return lengthRec(0, list)
}
