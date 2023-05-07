package practiceactivities
//Convert PracticeActivity43.kt to a lambda function
//PracticeActivity43.kt
//Write a function called calculateBMI() that takes in a person's weight in kilograms and height in meters,
// and returns their body mass index (BMI). The formula for BMI is weight (kg) / (height (m) * height (m)).

fun main() {
    print("Weight (kg): ")
    val weight = readln().toDouble()

    print("Height (m): ")
    val height = readln().toDouble()

    val bmi = calculateBMI2(weight, height)
    println("\nBMI: %.2f".format(bmi))
}
val calculateBMI2 = { weight: Double, height: Double -> weight / (height * height) }