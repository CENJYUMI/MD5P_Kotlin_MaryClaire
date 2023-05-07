package practiceactivities
//Write a program that prompts the user to enter their weight (in kilograms) and their height (in meters),
// and then calculates their body mass index (BMI).
//Use the following formula: BMI = weight / height^2. Then, determine the person's BMI category
// based on the following table:
//
//Underweight: BMI below 18.5
//Normal weight: BMI between 18.5 and 24.9
//Overweight: BMI between 25 and 29.9
//Obese: BMI 30 or higher

fun main(){

    //variables
    var weight1:Double = 0.00
    var height1:Double = 0.00
    var bmi:Double = 0.00

    //Input
    weight1 = 0.00
    height1 = 0.00
    bmi = weight1 / height1 * 2

    println("Enter Your Weight (in kg): ")
    weight1 = readln().toDouble()
    println("Enter Your Height (in meters): ")
    height1 = readln().toDouble()

    //Process
    bmi = (weight1 / height1) * 2

    //Output
    if(bmi  <= 18.52) {
        println("\nYour BMI is ${String.format("%,.2f", bmi)}, which is in the Under weight range.")
    }
    else if(bmi <= 24.9) {
        println("\nYour BMI is ${String.format("%,.2f", bmi)}, which is in the Normal weight range.")
    }
    else if(bmi <= 29.9) {
        println("\nYour BMI is ${String.format("%,.2f", bmi)}, which is in the Over weight range.")
    }
    else if(bmi >= 30) {
        println("\nYour BMI is ${String.format("%,.2f", bmi)}, which is in the Obese range.")
    }
}