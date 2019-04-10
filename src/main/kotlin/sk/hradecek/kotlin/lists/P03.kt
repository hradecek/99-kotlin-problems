package sk.hradecek.kotlin.lists

tailrec fun <T> nth(n: Int, list: List<T>): T = if (n == 0) list.first()
                                                else nth(n - 1, list.drop(1))
