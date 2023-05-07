package practiceactivities
//Create a Kotlin Program that would accept 9 numbers and display them in a 3 x 3 structure
//Check if it's a Magic Square.

fun main() {
    // Initialize the 3x3 square
    val square = mutableListOf<Int>()

    //Input
    for (i in 1..9) {
        print("Enter number $i: ")
        square.add(readln().toInt())
    }
    //Process and Output
    println("\nYour Answer")
    for (i in 0..2) {
        for (j in 0..2) {
            print("${square[i * 3 + j]}\t")
        }
        println()
    }

    //Check if the square is a magic square
    val magicSum = square.sum() / 3
    var isMagic = true
    for (i in 0..2) {
        // Check rows
        if (square[i*3] + square[i*3+1] + square[i*3+2] != magicSum) {
            isMagic = false
            break
        }

        // Check columns
        if (square[i] + square[i+3] + square[i+6] != magicSum) {
            isMagic = false
            break
        }
    }

    // Check diagonals
    if (square[0] + square[4] + square[8] != magicSum || square[2] + square[4] + square[6] != magicSum) {
        isMagic = false
    }

    // Output
    if (isMagic) {
        println("It is a magic square!")
    } else {
        println("It is not a magic square.")
    }
}

//  8  1  6
//  3  5  7
//  4  9  2

//  9  2  7
//  4  6  8
//  5  10 3
