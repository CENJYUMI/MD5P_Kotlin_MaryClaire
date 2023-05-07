package practiceactivities
//Write a program that prompts the user to enter the year (in four-digit format),
// and then determines whether the year is a leap year or not. A year is a leap year if it is divisible by 4,
// except for years that are divisible by 100 but not divisible by 400.

fun main(){
    var year:Int = 0


    //Input
    println("Enter a Year: ")
    year = readln().toInt()

    //Process and Output
    if(year % 4 == 0) {
        if (year % 100 != 0 || year % 400 == 0 ) {
            println("$year is a leap year")
        } else{
            println("$year is not a leap year")
        }
    }
}