package practiceactivities

fun main(){


    var num = 0
    var i = 0
    var factorial:Long = 1

    println("Enter a positive integer: ")
    num = readln().toInt()
    for (i in 1..num) {
        factorial *= i.toLong()


    }
    println("Factorial of $num is $factorial")
}