package leetCode.v15

import org.junit.jupiter.api.Test
import com.google.common.truth.Truth.assertThat
import com.google.common.truth.Truth.assertWithMessage


class ThreeSumTest {
    private val sol = Solution()

    @Test
    fun `(-1, 0, 1, 2, -1, -4) should output ((-1, -1, 2), (-1, 0, 1))`() {
        val t = sol.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
        assertThat(t).contains(listOf(listOf(-1, 0, 1), listOf(-1, -1, 2)))
    }

    @Test
    fun `() should output ()`() {
        assertThat(sol.threeSum(intArrayOf())).isEmpty()
    }

    @Test
    fun `(0) should output ()`() {
        assertThat(sol.threeSum(intArrayOf(0))).isEmpty()
    }
}