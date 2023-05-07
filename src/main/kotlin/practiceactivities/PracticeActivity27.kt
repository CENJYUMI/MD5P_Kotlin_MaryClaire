package practiceactivities
//Create a program that displays the matrix of a number entered by the user.
// If a user enters 4, it will generate 16 numbers; if 3, it will generate 9 numbers.
//Arrange the series of numbers in the order just like the sample output.
//Note: Maximum 3 println() or print() should be used in the solution.
// Use two looping statements only.

fun main() {
    print("Enter matrix to generate (n by n): ")
    val n = readln().toInt()

    var currentNum = n * n
    for (i in 1..n) {
        for (j in 1..n) {
            print("$currentNum \t")
            currentNum--
        }
        println()
    }
}
