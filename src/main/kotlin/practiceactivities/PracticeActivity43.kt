package practiceactivities
//Write a function called calculateBMI() that takes in a person's weight in kilograms and height in meters,
// and returns their body mass index (BMI). The formula for BMI is weight (kg) / (height (m) * height (m)).

fun main() {
    //Input
    print("Weight (kg): ")
    val weight = readln().toDouble()
    print("Height (m): ")
    val height = readln().toDouble()

    //Process
    val bmi = calculateBMI(weight, height)

    //Output
    println("\nBMI: %.2f".format(bmi))
}

//Function
fun calculateBMI(weight: Double, height: Double): Double {
    return weight / (height * height)
}
