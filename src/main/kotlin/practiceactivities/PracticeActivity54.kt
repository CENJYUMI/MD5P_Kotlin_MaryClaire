package practiceactivities
//Write a function called calculateAverage() that takes in any number of integer parameters,
// and returns the average of those numbers.
//If no parameters are provided, the function should return 0.

fun main(){

    println(calculateAverage(3,6,19,6,9))
}

fun calculateAverage(vararg nums: Int): Double {

    var sum = 0
    for (num in nums) {
        sum += num
    }
    return sum.toDouble() / nums.size
}
