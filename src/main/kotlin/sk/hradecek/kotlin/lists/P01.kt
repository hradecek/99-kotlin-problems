package sk.hradecek.kotlin.lists

import java.lang.IndexOutOfBoundsException

fun <T> last1(list: List<T>) = list.last()

fun <T> last2(list: List<T>) = list[list.size - 1]

fun <T> last3(list: List<T>) = list.reversed()[0]

fun <T> last4(list: List<T>) = list.reversed().first()

fun <T> last5(list: List<T>): T {
    fun <T> last(n: Int, list: List<T>): T =
            when (n) {
                list.size     -> throw IndexOutOfBoundsException()
                list.size - 1 -> list[n]
                else          -> last(n + 1, list)
            }
    return last(0, list)
}

