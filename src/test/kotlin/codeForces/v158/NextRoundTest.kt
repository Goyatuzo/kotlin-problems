package codeForces.v158

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NextRoundTest {
    @Test
    fun `k = 2, 0 0 0 0 is 0`() {
        assertEquals(0, NextRound.solve(2, listOf(0, 0, 0, 0)))
    }

    @Test
    fun `k = 5, 10 9 8 7 7 7 5 5 is 6`() {
        assertEquals(6, NextRound.solve(5, listOf(10, 9, 8, 7, 7, 7, 5, 5)))
    }

    @Test
    fun `k = 5, 10 9 8 0 0 0 0 0 is 3`() {
        assertEquals(3, NextRound.solve(5, listOf(10, 9, 8, 0, 0, 0, 0, 0)))
    }
}