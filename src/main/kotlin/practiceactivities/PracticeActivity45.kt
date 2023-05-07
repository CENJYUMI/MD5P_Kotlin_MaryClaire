package practiceactivities
//Write a function called findFactorial() that takes in a positive integer n and returns the factorial of n,
// which is the product of all positive integers from 1 to n.

fun main() {
    //declaration
    var num = 0

    //Input
    println("Enter a positive integer: ")
    num = readln().toInt()

    //Process
    var factorial = findFactorial(num)

    //Output
    println("Factorial of $num is $factorial")

}

//Function
fun findFactorial(n: Int): Int {
    var factorial = 1
    for (i in 1..n) {
        factorial *= i
    }
    return factorial
}
