package practiceactivities
//Write a function called convertTemperature() that takes in a temperature in Celsius and returns the equivalent
// temperature in Fahrenheit. The formula for converting Celsius to Fahrenheit is (Celsius * 9/5) + 32.

fun main() {
    //Input
    print("Temperature (Celsius): ")
    val celsius = readln().toDouble()

    //Process
    val fahrenheit = convertTemperature(celsius)

    //Output
    println("Temperature (Fahrenheit): $fahrenheit")
}

//Function
fun convertTemperature(celsius: Double): Double {
    val fahrenheit = (celsius * 9/5) + 32
    return fahrenheit
}
