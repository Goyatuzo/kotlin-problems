package leetCode.v15

class Solution {
    fun threeSum(nums: List<Int>): List<List<Int>> = when (nums.size) {
        0, 1, 2 -> emptyList()
        else -> nums.foldIndexed(emptyList()) { i, acc, target ->
            val map = mutableMapOf<Int, Int>()

            (i+1..nums.size).forEach { c ->
                if (map.containsKey(-c)) {
                    return acc + listOf(listOf(target, target - nums[c], nums[c]))
                }
                map[target - nums[c]] = nums[c]
            }

            return acc
        }
    }
}