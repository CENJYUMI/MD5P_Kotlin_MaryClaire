package ooppracticeactivities.ooppracticeactivity9

fun main(){
    println("Primary Constructor")
    println("\nMy Current Car")

    val car1 = Car()
    println("Make: ${car1.make}")
    println("Model: ${car1.model}")
    println("Year: ${car1.year}")

    println("\nSecondary Constructor")
    println("\nMy Dream Car")
    val car2 = Car("Ford","Mustang",2020)
    println("Make: ${car2.make}")
    println("Model: ${car2.model}")
    println("Year: ${car2.year}")


}