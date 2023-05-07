package practiceactivities
//Write a function called computeAverage() that takes in a list of numbers and returns their average.
// If the list is empty, the function should return 0.

fun main() {
    //Input
    val numbers = mutableListOf<Double>()
    repeat(5) {
        print("Enter Number ${it+1}: ")
        val input = readln()
        val number = input.toDouble()
        numbers.add(number)
    }
    //Process
    val average = computeAverage(numbers)

    //Output
    println("Average: $average")
}

//Function
fun computeAverage(numbers: List<Double>): Double {
    if (numbers.isEmpty()) {
        return 0.0
    }
    val sum = numbers.sum()
    return sum / numbers.size
}
