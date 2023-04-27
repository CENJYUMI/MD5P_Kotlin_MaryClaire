fun main() {
    //2 .

    //declare all variables
    var name: String = ""
    var currentYear: Int = 0
    var birthYear: Int = 0
    var ageOfPatricia: Int = 0

    //Input
    println ("Enter Your Name: ")
    name = readln()
    println ("Hi! $name. To know your age, please enter the current year: ")
    currentYear = readln().toInt()
    println ("Enter your birth year: ")
    birthYear = readln().toInt()

    //Process
    ageOfPatricia = currentYear - birthYear

    //Output
    println("\n$name, your age on $currentYear is $ageOfPatricia")

}