package practiceactivities
//Write a Kotlin program that prompts the user to enter a positive integer n,
// and then prints out all the odd numbers from 1 to n. Use repeat statement.
fun main(){
    //repeat statement

    var integer:Int = 0
    var counter:Int = 0

    //Input
    println("Enter a positive integer: ")
    integer = readln().toInt()

    //Process and Output
    repeat(integer) {
        if(it%2==1){
            println(it)
        }
    }
}