package practiceactivities
//Write a program that initializes an array of integers with five elements and prompts the user to enter an index.
// The program should display the value of the element at the specified index.
// If the user enters an index that is out of bounds, catch the exception and display an error message.
// Use try-catch / try-catch finally block

fun main() {
    val num = arrayOf(3, 6, 9, 12, 19)
    while (true) {
        try {
            print("\nEnter an index: ")
            val index = readln().toInt()
            val value = num[index]
            println("Value at index $index is $value")
            break
        } catch (e: NumberFormatException) {
            println("Error: Invalid input. Please enter a valid integer index.")
         } catch (e: IndexOutOfBoundsException) {
            println("Error: Index out of bounds. Please enter an index between 0 and 4.")
        } finally {
            println("Program complete.")
        }
    }
}
