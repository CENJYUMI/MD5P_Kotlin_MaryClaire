package kotlinbasics

fun main(){
    //if else if statement
    // age 0 - 12 -> Kids
    // age 13 - 18 -> Teen
    // age 19 - 59 -> Adult
    // age 60 and above
    var age : Int = 0
    // < > <= >= == !=
    println("Please Enter your age: ")
    age = readln().toInt()
    //age = -1
    if(age >= 60){
        println("Senior Citizen")
    }else if(age >= 19 ){
        println("Adults")
    }else if(age >= 13){
        println("Teenagers")
    }else if(age >= 0){
        println("Kids")
    }else {
        println("Invalid age")
    }
}