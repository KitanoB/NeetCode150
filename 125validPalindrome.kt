class Solution {
    fun isPalindrome(s: String): Boolean {
    var start = 0
    var end = s.length-1
    var result = true
    val charArray = s.toLowerCase().toCharArray()
    while (start<end){
        if(charArray[start] !in  'a'..'z' && !charArray[start].isDigit()) {
            start++
            continue
        }
        if(charArray[end] !in  'a'..'z' && !charArray[end].isDigit()) {
            end--
            continue
        }

        if(charArray[start] != charArray[end] ) {
            result = false
            break
        }
        start++
        end--

    }
    return result
    }
}
