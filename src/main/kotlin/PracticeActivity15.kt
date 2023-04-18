fun main() {

    var num1:Int = 0
    var num2:Int = 0
    var num3:Int = 0

    println("Enter number 1: ")
    num1 = readln().toInt()
    println("Enter number 2: ")
    num2 = readln().toInt()
    println("Enter number 3: ")
    num3 = readln().toInt()

    if ((num1 * num1) + (num2 * num2) == (num3 * num3)){
        println("These numbers form a Pythagorean triple.")
    }else{
        println("These numbers do not form a Pythagorean triple.")
    }



}
