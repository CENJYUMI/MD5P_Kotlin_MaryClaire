package practiceactivities
//Formulate function-oriented program Dozen that computes the number of dozen
// from the input number of eggs. Assign function determineDozen()
// that will compute the number of dozen; method showLessDozen() that computes less than 12 eggs.
// No display of output should be seen on these functions.

fun main(){
    //declaration
    var eggCount = 0
    var dozen = 0
    var lessDozen = 0

    //Input
    println("Enter the number of eggs:")
    eggCount = readln().toInt()

    //Process by Function
    dozen = determineDozen(eggCount)
    lessDozen = showLessDozen(eggCount)

    //Output
    println("\nThe Number of dozen: $dozen ")
    println("Eggs less than a dozen: $lessDozen")

}

//Function
fun determineDozen(eggCount:Int):Int{

    var dozen = eggCount / 12
    return dozen

}
//Function
fun showLessDozen(eggCount:Int):Int {

    var lessDozen = eggCount % 12
    return lessDozen
}