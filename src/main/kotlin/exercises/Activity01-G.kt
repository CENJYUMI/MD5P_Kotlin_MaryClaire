package exercises
//Create an application that will accept 1 string.
//Your application will print “Palindrome” if the string is a palindrome.
//Scope :
//String
//Loops

fun main() {
    print("Enter a string: ")
    val input = readln()
    val inputWithoutSpaces = input.replace(" ", "")
    val reversed = inputWithoutSpaces.reversed()

    if (inputWithoutSpaces.equals(reversed, ignoreCase = true)) {
        println("Palindrome")
    } else {
        println("Not a Palindrome")
    }
}
