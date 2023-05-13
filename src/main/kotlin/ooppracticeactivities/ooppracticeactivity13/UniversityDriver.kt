package ooppracticeactivities.ooppracticeactivity13

fun main() {
    val university = University("Manuel S. Enverga University Foundation")
    val student = university.Student("Mary Claire", 12345)

    println("University: ${university.name}")
    println("Student Name: ${student.name}")
    println("Student ID: ${student.id}")
}