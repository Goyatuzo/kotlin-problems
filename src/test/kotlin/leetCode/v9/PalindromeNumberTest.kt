package leetCode.v9

import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class PalindromeNumberTest {
    @Test
    fun `121 should output true`() {
        val sol = PalindromeNumber()
        assertEquals(true, sol.isPalindrome(121))
    }

    @Test
    fun `-121 should output false`() {
        val sol = PalindromeNumber()
        assertEquals(false, sol.isPalindrome(-121))
    }

    @Test
    fun `1221 should output true`() {
        val sol = PalindromeNumber()
        assertEquals(true, sol.isPalindrome(1221))
    }
}
