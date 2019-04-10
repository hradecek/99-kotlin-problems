package org.kotlin99.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

import sk.hradecek.kotlin.lists.nth

class P03Test {
    @Test fun `find the Nth element of a list`() {
        assertThat(nth(2, listOf(1, 1, 2, 3, 5, 8)), equalTo(2))
    }

    @Test(expected = NoSuchElementException::class)
    fun `Nth element outside of list size`() {
        nth(100, listOf(1, 1, 2, 3, 5, 8))
    }
}