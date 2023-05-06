fun main(){
    //implicit variable declaration
    //var name = "john"
    //the declaration above is similar to -> var name:String = "john"

    //Input - Process - Output
    println("Enter your name:")
    var name :String = readln()
    println("Hello $name!!")

    //for integer input
    println("Enter a number: ")
    var number : Int = readln().toInt()
    println("You have entered the number $number!")

}