package exercises
//Create an application that will accept 5 monetary amounts.
// After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
// The total of the 5  inputs will be divided by the answer in the second question input.
// Note: Error checking must be done.

fun main() {
    val amounts = mutableListOf<Double>()

    //Input
    for (i in 1..5) {
        print("Enter amount $i: ")
        val amount = readValidDoubleInput()
        amounts.add(amount)
    }

    print("Divide the value by how many? ")
    val divisor = readValidIntInput()

    // Calculate the total and divide by the divisor
    val total = amounts.sum()
    val result = total / divisor

    // Display the result
    println("Result: ${String.format("%,.2f",result)}")
}

fun readValidDoubleInput(): Double {
    while (true) {
        val input = readln()
        try {
            return input.toDouble()
        } catch (e: NumberFormatException) {
            println("Invalid input. Please enter a valid monetary amount.")
        }
    }
}

fun readValidIntInput(): Int {
    while (true) {
        val input = readln()
        try {
            return input.toInt()
        } catch (e: NumberFormatException) {
            println("Invalid input. Please enter a valid divisor.")
        }
    }
}
