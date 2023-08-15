class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
           val hashMap = hashMapOf<Int, Int>()
    for(num in nums){
        if(!hashMap.containsKey(num)) hashMap.put(num, 1)
        else hashMap.compute(num) { _, v -> v!! + 1 }
    }
    return hashMap.entries.sortedByDescending { it.value }.take(k).map { 
it.key }.toIntArray()
    }
}
