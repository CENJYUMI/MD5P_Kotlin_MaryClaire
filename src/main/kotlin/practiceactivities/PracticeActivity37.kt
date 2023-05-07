package practiceactivities
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

    //Process by Function
    perimeter = calculatePerimeter(length,width)
    area = calculateArea(length,width)

    //Output
    println("\nThe Perimeter is ${String.format("%,.2f", perimeter)} meters ")
    println("The Area is ${String.format("%,.2f", area)} meters")

}

//Function
fun calculatePerimeter(length:Double,width:Double):Double{

    var perimeter = 2 * (length + width)
    return perimeter

}

//Function
fun calculateArea(length:Double,width:Double):Double{
    var area = length * width
    return area
}