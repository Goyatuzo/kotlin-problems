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
        assertEquals("7/5", NearestFraction.solve(7, 2, 4))
    }
}