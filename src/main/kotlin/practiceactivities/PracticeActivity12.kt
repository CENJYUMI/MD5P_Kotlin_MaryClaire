package practiceactivities
//Create a program PracticeActivity12.kt that computes discount of passengers. Use the given table:
//fareCode	Passenger 	Discount 	if traveling in Business class
//
//O	Ordinary	0%	additional 1000.0
//S	Student	5%	additional 700.0
//C	Senior Citizen	10%	additional 500.0
//
//
//*If code is not within the selection make all output zero.Use when on your solution.

fun main() {

    //variables
    var fareCode1: Char = 'O'
    var fareCode2: Char = 'S'
    var fareCode3: Char = 'C'

    var passengerType: Char = '0'
    var businessClass:Char = '0'
    var busClass1: Double = 0.00
    var busClassN: Double = 0.00

    var fare: Double = 0.00
    var discount: Double = 0.00
    var newFare: Double = 0.00

    fare = 0.00
    newFare = 0.00
    busClass1 = 0.00

    //Input
    println("Enter Fare: ")
    fare = readln().toDouble()
    println("Enter Passenger type [O,S,C]: ")
    passengerType = readln().first()

    //Process and Output
    when (passengerType) {
        'O' -> {
            discount = fare * 0.00
            busClass1 = 1000.00
            println("Travelling in Business class [Y/N]:")
            businessClass = readln().first()

            if(businessClass == 'Y' || businessClass == 'y') {
                newFare = (fare - discount) + busClass1
                println("Discount is ${String.format("%,.2f", discount)}")
                println("Business class charge is ${String.format("%,.2f", busClass1)}")
                println("New Fare is ${String.format("%,.2f", newFare)}!")
            }else if (businessClass == 'N' || businessClass == 'n') {
                newFare = fare - discount
                println("Discount is ${String.format("%,.2f", discount)}")
                println("Business class charge is ${String.format("%,.2f", busClassN)}")
                println("New Fare is ${String.format("%,.2f", newFare)}!")
            }else {
                println("Invalid! Try Again!")
            }
        }
        'S' -> {
            discount = fare * 0.05
            busClass1 = 700.00
            println("Travelling in Business class [Y/N]:")
            businessClass = readln().first()

            if(businessClass == 'Y' || businessClass == 'y') {
                newFare = (fare - discount) + busClass1
                println("Discount is ${String.format("%,.2f", discount)}")
                println("Business class charge is ${String.format("%,.2f", busClass1)}")
                println("New Fare is ${String.format("%,.2f", newFare)}!")
            }else if (businessClass == 'N' || businessClass == 'n') {
                newFare = fare - discount
                println("Discount is ${String.format("%,.2f", discount)}")
                println("Business class charge is ${String.format("%,.2f", busClassN)}")
                println("New Fare is ${String.format("%,.2f", newFare)}!")
            }else {
                println("Invalid! Try Again!")
            }
        }
        'C' -> {
            discount = fare * 0.10
            busClass1 = 500.00
            println("Travelling in Business class [Y/N]:")
            businessClass = readln().first()

            if(businessClass == 'Y' || businessClass == 'y') {
                newFare = (fare - discount) + busClass1
                println("Discount is ${String.format("%,.2f", discount)}")
                println("Business class charge is ${String.format("%,.2f", busClass1)}")
                println("New Fare is ${String.format("%,.2f", newFare)}!")
            }else if (businessClass == 'N' || businessClass == 'n') {
                newFare = fare - discount
                println("Discount is ${String.format("%,.2f", discount)}")
                println("Business class charge is ${String.format("%,.2f", busClassN)}")
                println("New Fare is ${String.format("%,.2f", newFare)}!")
            }else {
                println("Invalid! Try Again!")
            }
        }
        else -> {
            println("Error! Please try again!")
        }

    }


}

