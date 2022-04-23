package leetCode.v9

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        val str = x.toString().toCharArray()

        (0 until str.size / 2).forEach { i ->
            if (str[i] != str[str.size - 1 - i]) {
                return false
            }
        }

        return true
    }
}
