package practiceactivities
//Create Kotlin program PracticeActivity5.kt that displays the amount he is going to pay if he avails different
// payment mode. 10% discount is imposed if payment made in cash; 5% penalty for payment made in 2 installments;
// 10% penalty for payment made in 3 installments.

fun main() {
    //declare all variables
    var name: String = "Glenn Jacobs"
    var unitsEnrolled: Int = 18
    var unitPrice: Double = 741.00
    var tuitionFee: Double = 0.00
    var cashPayment: Double = 0.00
    var installment2: Double = 0.00
    var installment3: Double = 0.00

    //Input
    println ("Enter Your Name: ")
    name = readln()
    println ("Hi! $name, you could available the following payment mode:")

    //Process
    tuitionFee = unitPrice * unitsEnrolled
    cashPayment = tuitionFee - (tuitionFee * 0.10)
    installment2 = (tuitionFee * 0.05) + tuitionFee
    installment3 = (tuitionFee * 0.10) + tuitionFee

    //Output
    println("\nComputed Tuition fee: ${String.format("%,.2f",tuitionFee)}  dollars")
    println("Payment Mode:")
    println("Cash Payment: ${String.format("%,.2f",cashPayment)} dollars")
    println("2-installment: ${String.format("%,.2f", installment2)} dollars")
    println("3-installment: ${String.format("%,.1f", installment3)} dollars")

}