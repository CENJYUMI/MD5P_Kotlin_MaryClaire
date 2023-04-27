fun main(){
    //Activity 6

    //Input
    var num : Int = 0

    //Output
    println("Enter a Number : ")
    num = readln().toInt()
    if(num >= 1){
        println("The number is positive")
    }else if(num <= -1 ){
        println("The number is negative")
    }else {
        println("The Number is zero")
    }
}