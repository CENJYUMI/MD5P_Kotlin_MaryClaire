fun main() {
    val numbers = mutableListOf<Int>()

    // get input from user
    repeat(5) {
        print("Enter number ${it + 1}: ")
        numbers.add(readln().toInt())
    }

    // find max and min values
    val max = numbers.maxOrNull()
    val min = numbers.minOrNull()

    // print results
    println("Max value is: $max")
    println("Min value is: $min")
}
