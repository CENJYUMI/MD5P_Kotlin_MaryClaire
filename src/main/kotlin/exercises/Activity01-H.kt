package exercises
//Create an application that will accept 2 Integers.
//It will identify the lower value and bigger value of the two inputs.
//Then, your application will print all the prime numbers starting from the lower number up to the largest number.
//Scope :
//String
//Loops

fun main() {
    print("Enter the first integer: ")
    val first = readln().toInt()
    print("Enter the second integer: ")
    val second = readln().toInt()

    val lower = minOf(first, second)
    val higher = maxOf(first, second)

    println("Prime numbers between $lower and $higher:")
    for (number in lower..higher) {
        if (isPrime(number)) {
            println(number)
        }
    }
}

fun isPrime(number: Int): Boolean {
    if (number < 2) {
        return false
    }
    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

