package practiceactivities
//Write a function called replaceSpaces() that takes in a string and replaces all spaces with underscores.

fun main() {
    //Input
    print("Enter a string: ")
    var input = readln()

    //Output
    println("String with spaces replaced: ${replaceSpaces(input)}")
}
//Function/Process
fun replaceSpaces(input: String): String {
    return input.replace(" ", "_")
}
