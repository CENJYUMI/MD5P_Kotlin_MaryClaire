package practiceactivities
//Write a program that finds the maximum and minimum element in an array of integers.

fun main() {
    val numbers = mutableListOf<Int>()

    // Input
    repeat(5) {
        print("Enter number ${it + 1}: ")
        numbers.add(readln().toInt())
    }

    // Process
    val max = numbers.maxOrNull()
    val min = numbers.minOrNull()

    // Output
    println("Max value is: $max")
    println("Min value is: $min")
}
