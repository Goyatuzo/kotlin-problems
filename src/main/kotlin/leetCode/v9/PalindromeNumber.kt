package leetCode.v9

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        val str = x.toString().toCharArray()

        (str.indices).forEach { i ->
            if (str[i] != str[str.size - 1 - i]) {
                return false
            }
        }

        return true
    }
}