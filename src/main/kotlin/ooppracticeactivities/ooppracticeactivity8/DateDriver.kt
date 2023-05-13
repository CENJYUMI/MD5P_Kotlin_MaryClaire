package ooppracticeactivities.ooppracticeactivity8

fun main(){
    println("Primary Constructor")
    val date1 = Date()
    println("My First Child was born on ${date1.month} ${date1.day}, ${date1.year}")

    println("\nSecondary Constructor")
    val date2 = Date("September",3,2016)
    println("My Second Child was born on ${date2.month} ${date2.day}, ${date2.year}")
}