package leetCode.v1

import kotlin.test.assertContentEquals
import org.junit.jupiter.api.Test

class TwoSumTest {
    private val sol = Solution()

    @Test
    fun `list = (2, 7, 11, 15), target = 9 should result (0, 1)`() {
        assertContentEquals(intArrayOf(0, 1), sol.twoSum(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test
    fun `list = (3, 2, 4), target = 6 should result (1, 2)`() {
        assertContentEquals(intArrayOf(1, 2), sol.twoSum(intArrayOf(3, 2, 4), 6))
    }

    @Test
    fun `list = (3, 3), target = 6 should result (0, 1)`() {
        assertContentEquals(intArrayOf(0, 1), sol.twoSum(intArrayOf(3, 3), 6))
    }
}
