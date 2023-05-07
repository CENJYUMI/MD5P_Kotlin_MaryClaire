package practiceactivities
//Create a Kotlin Program that would accept 9 numbers and display them in a 3 x 3 structure

fun main() {
    val matrix = mutableListOf<Int>()

    //Input
    for (i in 1..9) {
        print("Enter Number $i: ")
        matrix.add(readln().toInt())
    }

    //Process and Output
    println("Your Answer")
    for (i in 0..2) {
        for (j in 0..2) {
            print("${matrix[i*3+j]}\t")
        }
        println()
    }
}
