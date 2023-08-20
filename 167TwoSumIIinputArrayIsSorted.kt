// Runtime beats 54% of users with Kotlin
    // Memory beats 88% of users with Kotlin
    // Solution O(n) -- 0(2n) actually
    fun twoSum(numbers: IntArray, target: Int): IntArray {
    var result: IntArray = IntArray(2)
    var end = numbers.size-1
    main@for(n in numbers.indices){
            while (n<end && numbers[n]+numbers[end]>=target ){
            if(numbers[n]+numbers[end]==target){
                result = intArrayOf(n+1, end+1)
                break@main
            }
            end--
        }
    }
    return result
    }
