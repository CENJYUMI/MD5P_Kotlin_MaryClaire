package practiceactivities
//Write a program that counts the number of even elements in an array of integers.

fun main() {
    var number = ArrayList<Int>()
    var evenNumber = 0
    var ctr = 0


    repeat(5){
        println("Enter number ${it+1}")
        number.add(readln().toInt())
        evenNumber = number.count() {it%2==0}
        ctr++
    }
    println("The number of even numbers are $evenNumber")
}
