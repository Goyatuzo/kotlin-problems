package leetCode.v1

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hash = hashMapOf<Int, Int>()

        nums.forEachIndexed { idx, num ->
            if (hash.containsKey(num)) {
                return intArrayOf(hash.getOrElse(num) { -1 }, idx)
            }
            hash[target - num] = idx
        }

        return intArrayOf()
    }
}
