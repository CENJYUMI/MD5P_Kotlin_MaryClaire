package practiceactivities
//Convert PracticeActivity37.kt to lambda function
//PracticeActivity37.kt
//Create a function-oriented program that computes the perimeter and area of a rectangle.
// Designate functions calculatePerimeter() and calculateArea() that will facilitate the computation of values.
// No println() or display of output should be seen on these functions.

fun main(){
    var length = 0.00
    var width = 0.00
    var perimeter = 0.00
    var area = 0.00

    //Input
    println("Enter the Length:")
    length = readln().toDouble()

    println("Enter the Width:")
    width = readln().toDouble()

    //Function
    perimeter = calculatePerimeter2(length,width)
    area = calculateArea2(length,width)

    //Output
    println("\nThe Perimeter is ${String.format("%,.2f", perimeter)} meters ")
    println("The Area is ${String.format("%,.2f", area)} meters")

}

val calculatePerimeter2: (Double, Double) -> Double = { length, width -> 2 * (length + width) }

val calculateArea2: (Double, Double) -> Double = { length, width -> length * width }