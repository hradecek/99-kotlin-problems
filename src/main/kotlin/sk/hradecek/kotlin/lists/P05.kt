package sk.hradecek.kotlin.lists

fun <T> reverse1(list: List<T>): List<T> = if (list.isEmpty()) list
                                           else reverse1(list.drop(1)) + list[0]
