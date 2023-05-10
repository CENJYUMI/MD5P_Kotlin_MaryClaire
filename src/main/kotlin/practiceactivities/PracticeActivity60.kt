package practiceactivities
//Write a function that takes in a list of integers and a higher-order function as arguments.
// The higher-order function should take in an integer and return a string.
// The function should return a new list containing the strings returned by the
// higher-order function for each element in the input list.
//For example, given the list [1, 2, 3, 4, 5] and the higher-order function { n -> "Number: $n" },
// the function should return the list ["Number: 1", "Number: 2", "Number: 3", "Number: 4", "Number: 5"].


fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val transformedList = transformList(numbers) { n -> "Number: $n" }
    println(transformedList)

}


fun transformList(numbers: List<Int>, transformer: (Int) -> String): List<String> {
    return numbers.map { number -> transformer(number) }
}
