package practiceactivities
//Create program PracticeActivity11.kt that will compute for the average of the student and
//determine on three subjects and determine if falls under the following category:
//Average Grade 	Grade Status
//100 - 95 		President lister
//94 - 89 		Dean lister
//88 – 83 		Average Student
//82 - 78 		Fair
//lower than 78 		Failure
//more than 100 	Invalid grade


fun main(){

    var studentName:String = ""
    var gradeInPhysics:Double = 0.00
    var gradeInAlgebra:Double = 0.00
    var gradeInProgramming:Double = 0.00
    var grade:Double = 0.00
    var status:String = ""
    var averageGrade:Double = 100.00

    //Input
    println("Enter Your Name: ")
    studentName = readln()
    println("Enter your grade in Physic: ")
    gradeInPhysics = readln().toDouble()
    println("Enter your grade in Algebra: ")
    gradeInAlgebra = readln().toDouble()
    println("Enter your grade in Programming: ")
    gradeInProgramming = readln().toDouble()

    //Process
    averageGrade = (gradeInPhysics + gradeInAlgebra + gradeInProgramming)/3

    //Output
    if((averageGrade >= 95) && (averageGrade <= 100)) {
        println("\n$studentName average grade is ${String.format("%.2f", averageGrade)}")
        println("President lister")
    }
    else if((averageGrade >= 89) && (averageGrade <= 94)) {
        println("\n$studentName average grade is ${String.format("%.2f", averageGrade)}")
        println("Dean lister")
    }
    else if((averageGrade >= 83) && (averageGrade <= 88)){
        println("\n$studentName average grade is ${String.format("%.2f", averageGrade)}")
        println("Average Student")
    }
    else if((averageGrade >= 78) && (averageGrade <= 82)){
        println("\n$studentName average grade is ${String.format("%.2f", averageGrade)}")
        println("Fair")
    }
    else if(averageGrade <= 77) {
        println("\n$studentName average grade is ${String.format("%.2f", averageGrade)}")
        println("Failure")
    }
    else {
        println("\n$studentName average grade is ${String.format("%.2f", averageGrade)}")
        println("Invalid Grade")
    }


}