fun main(){
    var year:Int = 0


    //Input
    println("Enter a Year: ")
    year = readln().toInt()

    //Process
    if(year % 4 == 0) {
        if (year % 100 != 0 || year % 400 == 0 ) {
            println("$year is a leap year")
        } else{
            println("$year is not a leap year")
        }
    }



}