package leetCode

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hash = hashMapOf<Int, Int>()
        var match = intArrayOf()

        nums.forEachIndexed { idx, num ->
            if (hash.containsKey(num)) {
                match = intArrayOf(hash.getOrElse(num) { -1 }, idx)
            }
            hash[target - num] = idx
        }

        return match
    }
}