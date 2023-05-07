package practiceactivities
//Write a program that prints the multiplication table of a given number from 1 to 10.

fun main(){
    //declaration
    var num1 = 0
    var num2 = 0

    //Input
    println("Enter a positive number: ")
    num1 = readln().toInt()

    //Process and Output
    for(counter in 1..10){
        num2 = num1 * counter
        println("$num1 * $counter = $num2")
    }
}