package leetCode.v20

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class ValidParenthesisTest {
    private val sol = Solution()

    @Test
    fun `() should be true`() {
        assertThat(sol.isValid("()")).isTrue()
    }

    @Test
    fun `paren bracket curly should output true`() {
        assertThat(sol.isValid("()[]{}")).isTrue()
    }

    @Test
    fun `different termination should output false`() {
        assertThat(sol.isValid("(]")).isFalse()
    }

    @Test
    fun `starting from termination should output false`() {
        assertThat(sol.isValid("]")).isFalse()
    }
}