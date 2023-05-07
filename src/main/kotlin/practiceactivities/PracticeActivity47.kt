package practiceactivities
//Write a function called countWords() that takes in a string of text and returns the number of words in the text.
// A word is defined as any sequence of characters separated by whitespace.

fun main() {
    //Input
    print("Enter a string: ")
    val input = readln()
    //Process
    val result = countWords(input )
    //Output
    println("Number of words: $result")
}

//Function
fun countWords(text: String): Int {
    return text.split(" ").count()
}
