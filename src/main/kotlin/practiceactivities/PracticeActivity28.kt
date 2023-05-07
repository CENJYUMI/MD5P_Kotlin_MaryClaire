package practiceactivities
//Create a program that can convert fahrenheit to celsius or vice versa. After computing the conversion values,
// the program returns to the Main Menu. Use the following formula for the conversion:

fun main() {
    //declaration
    var selection: Char = '0'
    var celsius = 0.00
    var fahrenheit = 0.00
    var counter = 0

    //Input
    while (true) {
        println("\nMain Menu")
        println("[a] Celsius to Fahrenheit")
        println("[b] Fahrenheit to Celsius")
        println("[c] Exit")
        println("Choose option [a,b or c]")
        selection = readln().first()

        //Process and Output
        when (selection) {
            //Celsius to Fahrenheit
            'a' -> {
                println("Celsius-Fahrenheit Conversion")
                println("Enter celsius:")
                celsius = readln().toDouble()
                fahrenheit = celsius * (9.0 / 5.0) + 32.0
                println("Fahrenheit equivalent is ${String.format("%,.2f", fahrenheit)}")
            }
            'b' -> {
                println("Fahrenheit-Celsius Conversion")
                println("Enter Fahrenheit :")
                fahrenheit = readln().toDouble()
                celsius = (fahrenheit - 32.0) * (5.0 / 9.0)
                println("Celsius equivalent is $celsius")
            }
            'c' -> {
                println("End of program. Good bye!")
                break
            }
            else -> {
                print("Invalid input. Please try again.")
            }
        }
    counter++
    }
}

