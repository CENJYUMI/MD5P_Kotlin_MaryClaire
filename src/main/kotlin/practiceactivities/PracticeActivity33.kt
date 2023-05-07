package practiceactivities
//Reverse a string
//Write a program that takes a string as input and returns the same string with its characters reversed.
// (DO NOT use the reverse function  )

fun main() {
    //Input
    print("Enter a string: ")
    val input = readln()

    //Process
    var reversed = ""
    for (i in input.length - 1 downTo 0) {
        reversed += input[i]
    }

    //Output
    println("Reversed string: $reversed")
}