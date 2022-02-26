package leetCode.v20

class Solution {
    fun isValid(s: String): Boolean = s.fold("") { acc, curr ->
        when (curr) {
            '(', '{', '[' -> acc + curr
            ']' -> if (acc.last() == '[') acc.dropLast(1) else return false
            ')' -> if (acc.last() == '(') acc.dropLast(1) else return false
            '}' -> if (acc.last() == '{') acc.dropLast(1) else return false
            else -> return false
        }
    }.isEmpty()
}