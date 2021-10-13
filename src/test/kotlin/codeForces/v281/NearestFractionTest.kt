package codeForces.v281

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NearestFractionTest {
    @Test
    fun `3, 7, 6 results in 2 over 5`() {
        assertEquals("2/5", NearestFraction.solve(3, 7, 6))
    }

    @Test
    fun `7, 2, 4 results in 7 over 2`() {
        assertEquals("7/2", NearestFraction.solve(7, 2, 4))
    }

    @Test
    fun `1, 1, 1 results in 1 over 1`() {
        assertEquals("1/1", NearestFraction.solve(1, 1, 1))
    }

    @Test
    fun `1, 2, 1 results in 0 over 1`() {
        assertEquals("0/1", NearestFraction.solve(1, 2, 1))
    }
}