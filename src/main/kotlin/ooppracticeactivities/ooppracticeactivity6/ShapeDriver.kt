package ooppracticeactivities.ooppracticeactivity6

fun main(){
    println("Primary Constructor")
    val shape1 = Shape()
    println ("Length : ${shape1.length}")
    println ("Width : ${shape1.width}")

    println("\nSecondary Constructor")
    val shape2 = Shape(10,12)
    println ("Length : ${shape2.length}")
    println ("Width : ${shape2.width}")
}