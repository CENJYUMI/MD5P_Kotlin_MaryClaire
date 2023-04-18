fun main(){

    var num1:Int = 0
    var num2:Int = 0
    var num3:Int = 0
    var smallest:Int = 0

    println("Enter number 1: ")
    num1 = readln().toInt()
    println("Enter number 2: ")
    num2 = readln().toInt()
    println("Enter number 3: ")
    num3 = readln().toInt()

    if (num1<num2 && num1<num3){
        smallest = num1
    }
    else if (num2<num1 && num2<num3) {
        smallest = num2
    }
    else {
        smallest = num3
    }
    println("The smallest number is $smallest ")
}