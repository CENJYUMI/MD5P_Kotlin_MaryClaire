package kotlinbasics

fun main(){
    // logical operators
    var andOperator = (6 > 1) && (5 > 2) // will only be tru if both statement are true
    var orOperator = (1 > 5) || (6 > 3) // will only be false if both statements are false
    var notOperator = !(5 == 5) // inverts the result

    println(andOperator)
    println(orOperator)
    println(notOperator)


}