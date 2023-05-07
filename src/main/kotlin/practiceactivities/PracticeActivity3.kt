package practiceactivities
//Formulate a Kotlin program called PracticeActivity3.kt that computes the average price of a commodity on
// 3 succeeding days:
//Sample Input/Output:
//Enter item: gasoline
//Price in day 1: 39.99
//Price in day 2: 40.02
//Price in day 3: 38.97
//Average price of gasoline is 39.66 per gallon

fun main(){
    //declare all variables
    var priceDay1:Double = 39.99
    var priceDay2:Double = 40.02
    var priceDay3:Double = 38.97
    var averagePrice:Double = 0.00

    //input
    priceDay1 = 39.99
    priceDay2 = 40.02
    priceDay3 = 38.97

    //process
    averagePrice = (priceDay1 + priceDay2 + priceDay3)/3

    //output
    println("\nThe Average Price of Gasoline is ${String.format("%.2f", averagePrice)} per gallon")


}