package exercises
Identify 3 use cases that will efficiently use an Array, ArrayList, Set, Map.
Show in code the examples you mentioned.


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
