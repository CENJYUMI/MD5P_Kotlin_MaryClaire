fun main(){

    //Under weight: BMI below 18.5
    //Normal weight: BMI between 18.5 and 24.9
    //Overweight: BMI between 25 29.9
    //Obese: BMI 30 or higher

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

    bmi = (weight1 / height1) * 2
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