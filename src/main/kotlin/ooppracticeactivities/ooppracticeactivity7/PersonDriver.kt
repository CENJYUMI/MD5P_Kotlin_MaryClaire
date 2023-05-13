package ooppracticeactivities.ooppracticeactivity7

fun main() {
    //1st Constructor
    println("Primary Constructor")
    val person1 = Person()
    println("Name: ${person1.name}")
    println("Name: ${person1.age}")

    println("\nSecondary Constructor")
    val person2 = Person("Maryden Clarisse", 6)
    println("Name: ${person2.name}")
    println("Name: ${person2.age}")
}