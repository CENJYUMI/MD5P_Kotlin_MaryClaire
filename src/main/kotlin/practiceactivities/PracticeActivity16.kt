package practiceactivities
//Write a program that prompts the user to enter three numbers and then determines the smallest of the three numbers.

fun main(){
    //Declaration
    var num1:Int = 0
    var num2:Int = 0
    var num3:Int = 0
    var smallest:Int = 0

    //Input
    println("Enter number 1: ")
    num1 = readln().toInt()
    println("Enter number 2: ")
    num2 = readln().toInt()
    println("Enter number 3: ")
    num3 = readln().toInt()

    //Process
    if (num1<num2 && num1<num3){
        smallest = num1
    }
    else if (num2<num1 && num2<num3) {
        smallest = num2
    }
    else {
        smallest = num3
    }

    //Output
    println("The smallest number is $smallest ")
}