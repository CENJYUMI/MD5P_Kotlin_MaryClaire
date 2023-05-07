package practiceactivities
//Write a function that takes in a string and returns the string reversed.

fun main() {
    //Input
    print("Enter a string: ")
    val input = readln()

    //Process
    val result = removeDuplicates(input )

    //Output
    println("String with duplicates removed: $result")
}

//Function/Process
fun removeDuplicates(input: String): String {
    var result = ""
    var prevChar: Char? = null
    for (char in input) {
        if (char != prevChar) {
            result += char
        }
        prevChar = char
    }
    return result
}
