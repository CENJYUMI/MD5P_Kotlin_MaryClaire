package practiceactivities
//Write a program that prompts the user to enter their exam score (out of 100) and then displays their grade based
// on the following grading scale:
//
//90-100: A
//80-89: B
//70-79: C
//60-69: D
//Below 60: F

fun main(){

    //Variable
    var examScore : Int = 0

    //Input
    println("Enter your exam score: ")
    examScore = readln().toInt()

    //Process and Output
    if(examScore >= 90){
        println("A")
    }else if(examScore >= 80 ){
        println("B")
    }else if(examScore >= 70){
        println("C")
    }else if(examScore >= 60){
        println("D")
    }else {
        println("F")
    }
}