package practiceactivities
//Write a function called countOccurence() that takes in a string and a character,
// and returns the number of times the character appears in the string.

fun main() {
    //Input
    print("Enter a string: ")
    var string = readln()
    print("Enter a character: ")
    var char =readln()[0]

    //Process
    var count = countOccurence(string, char)

    //Output
    println("Character count: $count")
}
//Function
fun countOccurence(str: String, ch: Char): Int {
    var count = 0
    for (i in str.indices) {
        if (str[i] == ch) {
            count++
        }
    }
    return count
}
