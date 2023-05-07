package practiceactivities
//Formulate program that generates the series of numbers below using any combination of looping statements.
//Note: Maximum of 2 System println() or print() should be used in the solution. Use only two looping statements only.

fun main(){

    var num1 = 0
    var num2 = 0

    for (num1 in 25 downTo 21) {
        for (num2 in 0..4) {
            var num = num1 - num2 * 5
            print("$num\t")
        }
        println()
    }
}

