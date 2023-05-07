package practiceactivities
//Using a looping statement, create a program that produces the program below.
//Note: Maximum of 3 println() or print() should be used in the solution.

fun main() {
    var totalSquare = 0
    var totalCube = 0
    println("Number\t\tSquare\t\tCube")
    for (i in 2..10 step 2) {
        val square = i * i
        val cube = i * i * i
        totalSquare += square
        totalCube += cube
        println("$i\t\t\t$square\t\t\t$cube")
    }
    println("Total\t\t$totalSquare\t\t\t$totalCube")
}