package practiceactivities
//Write a program that reads in a map of phone numbers (where the keys are names and the values are phone numbers) and outputs the phone number for a given name.
//Default map data
//Name		Phone number
//Alice  	555-1234
//Bob 		555-5678
//Charlie	555-9101

fun main(){

    //declaration
    var name2:String = ""
    var phoneBook = mapOf(
        "Alice" to "555-1234",
        "Bob" to "555-5678",
        "Charlie" to "555-9101",
    )

    //Input
    println("What is the name? ")
    name2 = readln().trim()

    //Process and Output
    var phoneNumber = phoneBook[name2]

    for((name2,number) in phoneBook){
        if (phoneNumber != null) {
            println("\n$name2 phone number is $number.")
        }
        else{
            println("No phone number found for $name2.")
        }
    }
}