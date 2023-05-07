package practiceactivities
//Design program that allows users to enter the base size of a dollar figure using any looping statements.
//Note: Maximum of 3 print() or println() should be seen on the program. Use two looping statements only.
//Hint: There are spaces to be printed(except on the last line) before the dollar sign.

fun main() {
    print("Enter base size of dollar triangle: ")
    val baseSize = readln().toInt()
    for (i in 1..baseSize) {
        for (j in i..baseSize-1) {
            print(" ")
        }
        for (j in 1..i) {
            print("$")
        }
        println("")
    }
}