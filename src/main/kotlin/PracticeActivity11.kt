import javax.swing.InputMap

fun main(){
    //Average Grade and Status
    //100 - 95 = President lister
    //94 - 89 = Dean lister
    //88 - 83 = Average Student
    //82 - 78 = Fair
    //lower than 78 = Failure
    //more than 100 = Invalid Grade

    var studentName:String = ""
    var gradeInPhysics:Double = 0.00
    var gradeInAlgebra:Double = 0.00
    var gradeInProgramming:Double = 0.00
    var grade:Double = 0.00
    var status:String = ""
    var averageGrade:Double = 100.00

    //Input
    studentName = ""
    gradeInPhysics = 0.00
    gradeInAlgebra = 0.00
    gradeInProgramming = 0.00
    grade = 0.00
    status = ""
    averageGrade = 100.00

    println("Enter Your Name: ")
    studentName = readln()
    println("Enter your grade in Physic: ")
    gradeInPhysics = readln().toDouble()
    println("Enter your grade in Algebra: ")
    gradeInAlgebra = readln().toDouble()
    println("Enter your grade in Programming: ")
    gradeInProgramming = readln().toDouble()

    averageGrade = (gradeInPhysics + gradeInAlgebra + gradeInProgramming)/3

    if(averageGrade <= 100) {
        println("\n$studentName average grade is ${String.format("%,.2f", averageGrade)}")
        println("President lister")
    }
    else if(averageGrade <= 94) {
        println("\n$studentName average grade is ${String.format("%,.2f", averageGrade)}")
        println("Dean lister")
    }
    else if(averageGrade <= 88) {
        println("\n$studentName average grade is ${String.format("%,.2f", averageGrade)}")
        println("Average Student")
    }
    else if(averageGrade <= 82) {
        println("\n$studentName average grade is ${String.format("%,.2f", averageGrade)}")
        println("Fair")
    }
    else if(averageGrade <= 77) {
        println("\n$studentName average grade is ${String.format("%,.2f", averageGrade)}")
        println("Failure")
    }
    else if(averageGrade >= 101) {
        println("\n$studentName average grade is ${String.format("%,.2f", averageGrade)}")
        println("Invalid Grade")
    }


}