
fun main(){
    println("Enter number:")
    var input = readln().toInt()
    var num = cube(input)
    println("The cube of $input is $num")
}

fun cube(number:Int):Int{ //parameters - arguments within a function
    var result:Int = number * number * number

    return result
}