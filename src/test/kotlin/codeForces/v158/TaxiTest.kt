package codeForces.v158

import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class TaxiTest {
    @Test
    fun `1 2 4 3 3 is 4`() {
        assertEquals(4, Taxi.solve(listOf(1, 2, 4, 3, 3)))
    }

    @Test
    fun `2 3 4 4 2 1 3 1 is 5`() {
        assertEquals(5, Taxi.solve(listOf(2, 3, 4, 4, 2, 1, 3, 1)))
    }

    @Test
    fun `4 4 3 3 is 4`() {
        assertEquals(4, Taxi.solve(listOf(4, 4, 3, 3)))
    }

    @Test
    fun `4 4 3 3 2 is 5`() {
        assertEquals(5, Taxi.solve(listOf(4, 4, 3, 3, 2)))
    }

    @Test
    fun `4 4 3 3 2 1 1 is 5`() {
        assertEquals(5, Taxi.solve(listOf(4, 4, 3, 3, 2, 1, 1)))
    }

    @Test
    fun `4 4 3 3 2 1 1 1 1 1 is 6`() {
        assertEquals(6, Taxi.solve(listOf(4, 4, 3, 3, 2, 1, 1, 1, 1, 1)))
    }

    @Test
    fun `4 4 3 3 2 2 is 5`() {
        assertEquals(5, Taxi.solve(listOf(4, 4, 3, 3, 2, 2)))
    }

    @Test
    fun `4 4 3 3 2 2 1 1 is 6`() {
        assertEquals(5, Taxi.solve(listOf(4, 4, 3, 3, 2, 2, 1, 1)))
    }
}
