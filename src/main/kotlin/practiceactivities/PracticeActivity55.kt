package practiceactivities
//Write a program that prompts the user to enter two numbers, divides the first number by the second,
// and displays the result. If the second number is zero, catch the exception and display an error message.
// Use try-catch / try-catch finally block

fun main() {
    var number1: Int = 0
    var number2: Int = 0

    while (true) {
        try {
            println("\nEnter number 1:")
            number1 = readln().toInt()
            println("Enter number 2:")
            number2 = readln().toInt()
            println("The quotient is ${number1 / number2}")
            break
        } catch (exception: Exception) {
            println("Error: Division by zero!")
        }
    }
}