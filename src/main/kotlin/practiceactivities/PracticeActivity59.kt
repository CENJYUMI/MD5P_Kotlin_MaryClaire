package practiceactivities
//Write a program that prompts the user to enter a decimal number, converts it to an integer, and displays the result.
// If the user enters a non-numeric value or a value that cannot be converted to an integer, catch the exception and
// display an error message. Use try-catch / try-catch finally block
fun main() {
    while (true) {
        try {
            //Input
            print("\nEnter a decimal number: ")
            val input = readln()

            //process
            val number = input.toDouble().toInt()

            //Output
            println("Converted to integer: $number")
            break
        } catch (e: NumberFormatException) {
            println("Error: Invalid input. Please enter a valid decimal number.")
        }
    }
}
