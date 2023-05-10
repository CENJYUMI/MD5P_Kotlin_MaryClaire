package ooppracticeactivities.ooppracticeactivity5

class Student (var name:String, var age:Int, var grade:Int) {
    fun promote() {
        grade++
    }
    fun printDetails() {
        println("Name: $name")
        println("Age: $age")
        println("Grade: $grade")
    }
}