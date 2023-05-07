package practiceactivities
//Write a program that prompts the user to enter a number and then checks whether the number is positive, negative,
// or zero. If the number is positive, the program should print "The number is positive." If the number is negative,
// the program should print "The number is negative." If the number is zero, the program should print
// "The number is zero."

fun main(){
    //Variables
    var num : Int = 0

    //Input
    println("Enter a Number : ")
    num = readln().toInt()

    //Process and Output
    if(num >= 1){
        println("The number is positive")
    }else if(num <= -1 ){
        println("The number is negative")
    }else {
        println("The Number is zero")
    }
}