package org.kotlin99.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

import sk.hradecek.kotlin.lists.reverse1

class P05Test {
    @Test fun `reverse a list`() {
        assertThat(reverse1(listOf<Int>()), equalTo(emptyList()))
        assertThat(reverse1(listOf(1)), equalTo(listOf(1)))
        assertThat(reverse1(listOf(1, 1, 2, 3, 5, 8)), equalTo(listOf(8, 5, 3, 2, 1, 1)))
    }
}