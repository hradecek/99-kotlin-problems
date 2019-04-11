package org.kotlin99.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

import sk.hradecek.kotlin.lists.length1
import sk.hradecek.kotlin.lists.length2

class P04Test {
    @Test fun `find the number of elements of a list`() {
        assertThat(length1(listOf<Int>()), equalTo(0))
        assertThat(length1(listOf(1, 1, 2, 3, 5, 8)), equalTo(6))

        assertThat(length2(listOf<Int>()), equalTo(0))
        assertThat(length2(listOf(1, 1, 2, 3, 5, 8)), equalTo(6))
    }
}