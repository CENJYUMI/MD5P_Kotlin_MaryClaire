package practiceactivities
//Convert PracticeActivity42.kt to infix function
//PracticeActivity42.kt
//Write a function called countOccurence() that takes in a string and a character, and
//returns the number of times the character appears in the string.
//Sample Input/Output

fun main() {
    //Input
    print("Enter a string: ")
    var string = readln()
    print("Enter a character: ")
    var char =readln()[0]

    //Process
    var count = string countOccurence char

    //Output
    println("Character count: $count")
}

//Function
infix fun String.countOccurence(otherChar:Char): Int {
    var count = 0
    for (i in indices) {
        if (this[i] == otherChar) {
            count++
        }
    }
    return count
}
