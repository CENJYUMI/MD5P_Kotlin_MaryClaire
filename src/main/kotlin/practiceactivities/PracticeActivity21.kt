package practiceactivities
//Write a program that prints the following pattern:
//
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5

fun main() {
    // Number of rows
    val n = 5

    for (i in 1..n) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}
