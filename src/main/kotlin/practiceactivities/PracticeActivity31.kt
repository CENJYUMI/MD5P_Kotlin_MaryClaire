package practiceactivities
//Write a Kotlin program that reads in two sets of integers and outputs the intersection of the sets
// (i.e., the common elements in both sets).

fun main() {

    val setA = mutableSetOf<Int>()
    val setB = mutableSetOf<Int>()

    // Get input for Set A
    println("Values for Set A")
    for (i in 1..5) {
        print("Enter number $i: ")
        setA.add(readln().toInt())
    }

    // Get input for Set B
    println("\nValues for Set B")
    for (i in 1..5) {
        print("Enter number $i: ")
        setB.add(readln().toInt())
    }

    // Find intersection of sets
    val intersection = setA.intersect(setB)

    // Print intersection
    println("\nIntersection of the sets: $intersection")
}