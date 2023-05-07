package practiceactivities
//Convert PracticeActivity45.kt to a lambda function
//PracticeActivity45.kt
//Write a function called findFactorial() that takes in a positive integer n and returns the factorial of n,
// which is the product of all positive integers from 1 to n.

fun main() {

    println("Enter a positive integer: ")
    var num = readln().toInt()

    var factorial = findFactorial2(num)

    println("Factorial of $num is $factorial")

}
val findFactorial2 = { n: Int ->
    var factorial = 1
    for (i in 1..n) {
        factorial *= i
    }
    factorial
}