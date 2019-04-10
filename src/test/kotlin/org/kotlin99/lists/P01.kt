package org.kotlin99.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

import sk.hradecek.kotlin.lists.*

class P01Test {
    @Test fun `find the last element of a list`() {
        assertThat(last1(listOf(1, 1, 2, 3, 5, 8)), equalTo(8))
        assertThat(last2(listOf(1, 1, 2, 3, 5, 8)), equalTo(8))
        assertThat(last3(listOf(1, 1, 2, 3, 5, 8)), equalTo(8))
        assertThat(last4(listOf(1, 1, 2, 3, 5, 8)), equalTo(8))
        assertThat(last5(listOf(1, 1, 2, 3, 5, 8)), equalTo(8))
    }

    @Test(expected = IndexOutOfBoundsException::class)
    fun `last element in empty list`() {
        last1(listOf<Int>())
        last2(listOf<Int>())
        last3(listOf<Int>())
        last4(listOf<Int>())
        last5(listOf<Int>())
    }
}