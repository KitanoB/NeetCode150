class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
    // Beats 91% of users with Kotlin
    // Beats 63% of users with Kotlin

    val result = mutableListOf<List<Int>>()
    if (nums.size < 3) return result

    nums.sort()

    for (i in nums.indices) {
        if (i > 0 && nums[i] == nums[i - 1]) continue 

        var left = i + 1
        var right = nums.size - 1

        while (left < right) {
            val sum = nums[i] + nums[left] + nums[right]
            when {
                sum == 0 -> {
                    result.add(listOf(nums[i], nums[left], nums[right]))
                    left++
                    right--

                    while (left < right && nums[left] == nums[left - 1]) left++
                    while (left < right && nums[right] == nums[right + 1]) right-- 
                }
                sum < 0 -> left++
                else -> right--
            }
        }
    }

    return result
    }
}
