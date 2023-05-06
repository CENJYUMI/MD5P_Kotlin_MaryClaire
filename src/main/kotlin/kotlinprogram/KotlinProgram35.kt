fun main() {
    var number1: Int = 0
    var number2: Int = 0

    //Exception handling - try and catch block
    while (true) {
        try {
            println("\n************************")
            println("Simple Calculator")
            println("************************")
            println("Enter number 1:")
            number1 = readln().toInt()
            println("Enter number 2:")
            number2 = readln().toInt()
            println("The quotient is ${number1 / number2}")
            break
        } catch (exception: Exception) {
            println("Wrong Input! Integer Inputs only!")
        }


    }


}