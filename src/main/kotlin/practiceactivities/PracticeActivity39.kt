package practiceactivities
//Write a function that takes in a string and returns the string reversed.

fun main() {
    //declaration
    var reversed = ""
    var input = ""

    //Input
    println("Enter a Text:")
    input = readln()

    //Process by Function
    reversed = reverseString(input)

    //Output
    println("$reversed")


}

//Function
fun reverseString(input: String): String {
    var output = ""
    for (i in input.length - 1 downTo 0) {
        output += input[i]
    }
    return output
}
