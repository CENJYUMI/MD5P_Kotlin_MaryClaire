package practiceactivities
//Write Kotlin program that computes the perimeter and area of a rectangle based on the input length and width
// values of the user.
fun main(){
    //declare all variables
    var length:Double = 12.5
    var width:Double = 36.55

    //input
    println ("Enter the Length")
    length = readln().toDouble()
    println ("Enter the Width")
    width = readln().toDouble()

    //process
    var perimeter = (length*2) + (width*2)
    var area = length * width

    //output
    println("The Perimeter is $perimeter meters")
    println("")
    print("The Area is $area meters")
    println("")
}