package practiceactivities
//Write a program that prompts the user to enter a positive integer, calculates the factorial of that integer,
// and displays the result. If the user enters a negative number or a non-integer value, catch the exception and
// display an error message. Use try-catch / try-catch finally block

fun main() {
    while (true) {
        try {
            println("\nEnter a positive integer: ")
            var num = readln().toInt()
            var factorial = findFactorial3(num)
            if (num < 0) {
                throw Exception("Invalid input. Please enter a positive integer.")
            }
            println("Factorial of $num is $factorial")
            break
        }catch (exception: Exception) {
            println("Error: Invalid input. Please enter a positive integer.")
        }finally {
            println("Program completed.")
        }
    }
}

val findFactorial3 = { n: Int ->
    var factorial = 1
    for (i in 1..n) {
        factorial *= i
    }
    factorial
}