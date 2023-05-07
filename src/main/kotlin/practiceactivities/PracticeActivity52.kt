package practiceactivities
//Convert PracticeActivity46.kt to a lambda function
//PracticeActivity46.kt
//Write a function called computeAverage() that takes in a list of numbers and returns their average.
//If the list is empty, the function should return 0.

fun main() {
    val numbers = mutableListOf<Double>()
    repeat(5) {
        print("Enter Number ${it+1}: ")
        val input = readln()
        val number = input.toDouble()
        numbers.add(number)
    }
    val average = computeAverage(numbers)
    println("\nAverage: $average")
}

val computeAverage = { numbers: List<Double> -> numbers.sum() / numbers.size }
