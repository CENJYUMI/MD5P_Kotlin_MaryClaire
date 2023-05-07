package practiceactivities
//Convert PracticeActivity37.kt to infix function
//PracticeActivity37.kt
//Create a function-oriented program that computes the perimeter and area of a rectangle.
// Designate functions calculatePerimeter() and calculateArea() that will facilitate the computation of values.
// No println() or display of output should be seen on these functions.

fun main(){
    //declaration
    var length = 0.00
    var width = 0.00
    var perimeter = 0.00
    var area = 0.00

    //Input
    println("Enter the Length:")
    length = readln().toDouble()

    println("Enter the Width:")
    width = readln().toDouble()

    // Function/Process
    perimeter = length calculatePerimeter width
    area = length calculateArea width

    // Output
    println("\nThe Perimeter is ${String.format("%,.2f", perimeter)} meters ")
    println("The Area is ${String.format("%,.2f", area)} meters")
}

//Function
infix fun Double.calculatePerimeter(width: Double): Double {
    return 2 * (this + width)
}

infix fun Double.calculateArea(width: Double): Double {
    return this * width
}