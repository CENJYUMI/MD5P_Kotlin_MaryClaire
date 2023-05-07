package practiceactivities
//Write a program that prompts the user to enter a number between 1 and 7, where 1 represents Monday,
// 2 represents Tuesday, and so on. The program should then display the corresponding day of the week.
// If the user enters a number outside the range of 1-7, the program should display an error message.
// (use when statement)

fun main(){
    //Days of the week

    var daysOfTheWeek:Int = 7
    var monday:Int = 1
    var tuesday:Int = 2
    var wednesday:Int = 3
    var thursday:Int = 4
    var friday:Int = 5
    var saturday:Int = 6
    var sunday:Int = 7

    //Input
    println("Enter a number between 1 and 7:")
    daysOfTheWeek = readln().toInt()

    //Process and Output
        when(daysOfTheWeek){
        1 -> {
            println("The corresponding day of the week is Monday")
        }
        2 -> {
            println("The corresponding day of the week is Tuesday")
        }
        3 -> {
            println("The corresponding day of the week is Wednesday")
        }
        4 -> {
            println("The corresponding day of the week is Thursday")
        }
        5 -> {
            println("The corresponding day of the week is Friday")
        }
        6 -> {
            println("The corresponding day of the week is Saturday")
        }
        7 -> {
            println("The corresponding day of the week is Sunday")
        }
        else -> {
            println("Error: Please enter a number between 1 and 7.")
        }
    }

}