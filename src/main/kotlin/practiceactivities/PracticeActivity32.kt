package practiceactivities
//Design program in HBO pay per view that displays the list of athletes with their sales. The user has an option to enter the top 5 athlete’s name and sales.
//Compute its total sales at the end.

fun main() {

    val athletes = mutableListOf<String>()
    val sales = mutableListOf<Double>()

    //Input
    for (i in 1..5) {
        print("Enter athlete $i: ")
        val name = readln().trim()
        athletes.add(name)

        print("Enter sales: ")
        val sale = readln().toDouble()
        sales.add(sale)
    }

    //Process
    println("\nTop SportsMan")
    println("Name \t\tSales")
    println("===================================")
    for (i in athletes.indices) {
        val name = athletes[i]
        val sale = sales[i]
        println("$name \t$${String.format("%,.2f", sale)}")
    }
    println("===================================")

    var totalSales = 0.0
    for (sale in sales) {
        totalSales += sale
    }

    //Output
    println("Total \t\t$${String.format("%,.2f", totalSales)}")
}