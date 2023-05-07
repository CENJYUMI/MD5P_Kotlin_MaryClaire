package practiceactivities
//Write a Kotlin program that prompts the user to enter a positive integer n, and then prints out the factorial of n.
// Use do-while statement.

fun main(){
    //variable declaration
    var num = 0
    var i = 0
    var factorial:Long = 1

    //Input
    println("Enter a positive integer: ")
    num = readln().toInt()

    //Process
    for (i in 1..num) {
        factorial *= i.toLong()

    }
    //Output
    println("Factorial of $num is $factorial")
}