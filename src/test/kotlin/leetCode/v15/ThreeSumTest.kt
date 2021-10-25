package leetCode.v15

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ThreeSumTest {
    private val sol = Solution()

    @Test
    fun `(-1, 0, 1, 2, -1, -4) should output ((-1, -1, 2), (-1, 0, 1))`() {
        assertEquals(listOf(listOf(-1, 0, 1), listOf(-1, -1, 2)), sol.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)))
    }

    @Test
    fun `() should output ()`() {
        assertEquals(emptyList(), sol.threeSum(intArrayOf()))
    }

    @Test
    fun `(0) should output ()`() {
        assertEquals(emptyList(), sol.threeSum(intArrayOf(0)))
    }
}