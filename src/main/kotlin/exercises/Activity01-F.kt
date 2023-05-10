package exercises
//  Scope : String, Loops
// Create an application that will accept 2 string inputs.
// Your application will print all unique characters in both Strings.
// Union of Unique characters in both Strings
fun main() {
    // Prompt the user to enter two strings
    print("Enter string 1: ")
    val string1 = readln()
    print("Enter string 2: ")
    val string2 = readln()

    // Combine the two strings
    val combinedString = string1 + string2

    // Find the unique characters
    val uniqueCharacters = combinedString.toSet()

    // Print the unique characters
    println("Unique: ${uniqueCharacters.joinToString("")}")
}
