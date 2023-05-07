package practiceactivities
//Write a program that prompts the user to enter two integers and performs various arithmetic operations on them,
// such as addition, subtraction, multiplication, and division. If any of the operations result in an
// arithmetic overflow, catch the exception and display an error message.Use try-catch / try-catch finally block
fun main() {
    while (true) {
        try {
            //Input
            print("\nEnter the first number: ")
            val num1 = readln().toLong()
            print("Enter the second number: ")
            val num2 = readln().toLong()

            val maxNum1 = Math.toIntExact(num1)
            val maxNum2 = Math.toIntExact(num2)

            //Process
            val add = { num1: Long, num2: Long -> num1 + num2 }
            val diff = { num1: Long, num2: Long -> num1 - num2 }
            val prod = { num1: Long, num2: Long -> num1 * num2 }
            val quotient = { num1: Long, num2: Long -> num1 / num2 }

            //Output
            println(add(maxNum1.toLong(), maxNum2.toLong()))
            println(diff(maxNum1.toLong(), maxNum2.toLong()))
            println(prod(maxNum1.toLong(), maxNum2.toLong()))
            println(quotient(maxNum1.toLong(), maxNum2.toLong()))
            break
        }catch (exception: ArithmeticException) {
            println("Error: Arithmetic overflow. The result of the operation exceeds the maximum value of an integer.")
        }catch (exception:NumberFormatException){
            println("Error: NumberFormatException")
        }
    }
}