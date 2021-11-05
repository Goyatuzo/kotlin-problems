package leetCode.v15

// TODO: This is not the most efficient
class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> = when (nums.size) {
        0, 1, 2 -> emptyList()
        else -> nums.sorted().foldIndexed<Int, List<List<Int>>>(emptyList()) { i, acc, target ->
            val map = mutableMapOf<Int, Int>()
            var currentAccumulation = listOf<List<Int>>()

            (i+1 until nums.size).forEach { c ->
                val curr = nums[c]
                if (map.containsKey(-curr)) {
                    currentAccumulation = currentAccumulation + listOf(listOf(target, curr, map.getValue(-curr)))
                }
                map[target + curr] = curr
            }

            if (currentAccumulation.isNotEmpty()) {
                acc + currentAccumulation
            } else {
                acc
            }
        }
            .toSet()
            .toList()
    }
}