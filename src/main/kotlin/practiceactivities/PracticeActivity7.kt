package practiceactivities
//Write a program that prompts the user to enter a number and then checks whether the number is odd or even.
// If the number is even, the program should print "The number is even." If the number is odd,
// the program should print "The number is odd."

fun main(){
    //Variables
    var num : Int = 0

    //Input
    println("Enter a Number : ")
    num = readln().toInt()

    //Process and Output
    if(num%2==0){
        println("The number is even")
    }else {
        println("The number is odd")
    }

}