class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        set.addAll(nums.toList())
        return set.size != nums.size
    }
}
