class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
     var sum = 0
    var result = intArrayOf(0, 0)
    var index = 0
    val stack = mutableListOf<Int>()
    stack.add(nums[0])
    while (stack.isNotEmpty()) {
        val current = stack.removeAt(0)
        sum = current
        for (n in nums.indices) {
            if (index != n) sum += nums[n]
            else continue
            if (sum == target) {
                result[0] = index
                result[1] = n
                return result
            }
            sum-=nums[n]

        }
        index++
        if(index==nums.size)return result
        stack.add(nums[index])

    }
    return result
    }
}
