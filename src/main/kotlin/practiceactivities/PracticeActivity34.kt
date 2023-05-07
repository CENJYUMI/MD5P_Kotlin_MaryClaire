package practiceactivities
//Count the number of vowels
//Write a Program that takes a string as input and returns the number of vowels (a, e, i, o, u) in the string.

fun main() {
    //Input
    print("Enter a string: ")
    val str = readln().lowercase()
    var count = 0

    //Process
    for (char in str) {
        if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u') {
            count++
        }
    }

    //Output
    println("Number of vowels in the string: $count")
}