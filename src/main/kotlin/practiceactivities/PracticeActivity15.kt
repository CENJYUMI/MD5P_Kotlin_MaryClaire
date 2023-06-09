package practiceactivities
//Write a program that prompts the user to enter three numbers,
// and then determines whether the numbers form a Pythagorean triple (i.e., whether a^2 + b^2 = c^2,
// where a, b, and c are the three numbers).
fun main() {

    //declaration
    var num1:Int = 0
    var num2:Int = 0
    var num3:Int = 0

    //Input
    println("Enter number 1: ")
    num1 = readln().toInt()
    println("Enter number 2: ")
    num2 = readln().toInt()
    println("Enter number 3: ")
    num3 = readln().toInt()

    //Process and Output
    if ((num1 * num1) + (num2 * num2) == (num3 * num3)){
        println("These numbers form a Pythagorean triple.")
    }else{
        println("These numbers do not form a Pythagorean triple.")
    }
}
