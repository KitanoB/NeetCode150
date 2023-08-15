class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = mutableListOf<MutableList<String>>()
        val map = hashMapOf<List<Char>, MutableList<String>>()
        if (strs.isNotEmpty()) {
            for (str in strs) {
                val charArray = str.toCharArray().sorted()
                if (!map.containsKey(charArray)) {
                    val list = mutableListOf<String>()
                    map.put(charArray, list)
                    result.add(list)
            }
            map.get(charArray)?.add(str)
        }

    }
    return result
    }
}
