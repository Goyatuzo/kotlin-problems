package leetCode

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TwoSumTest {
    val sol = Solution()

    @Test
    fun `list = (2, 7, 11, 15), target = 9 should result (0, 1)`() {
        assertEquals(intArrayOf(0, 1), sol.twoSum(intArrayOf(2, 7, 11, 15), 9))
    }
}