package leetCode.v15

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ThreeSumTest {
    private val sol = Solution()

    @Test
    fun `(-1, 0, 1, 2, -1, -4) should output ((-1, -1, 2), (-1, 0, 1))`() {
        assertEquals(listOf(listOf(-1, -1, 2), listOf(-1, 0, 1)), sol.threeSum(listOf(-1, 0, 1, 2, -1, -4)))
    }

    @Test
    fun `() should output ()`() {
        assertEquals(emptyList(), sol.threeSum(emptyList()))
    }

    @Test
    fun `(0) should output ()`() {
        assertEquals(emptyList(), sol.threeSum(listOf(0)))
    }
}