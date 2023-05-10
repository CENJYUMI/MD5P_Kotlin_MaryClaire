package ooppracticeactivities.ooppracticeactivity5

fun main(){
    val myStudent = Student("Charles Jayvin Capili", 12, 6 )
    myStudent.printDetails()

    println("\nPromoting the student...")
    myStudent.promote()

    println("\nAfter promotion:")
    myStudent.printDetails()

}