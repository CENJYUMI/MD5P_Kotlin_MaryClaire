fun main(){
    //1. Assume base = 10 and height = 2

    //declare all variables
    var base:Int = 10
    var height:Int = 2

    //input
    println ("Enter the Base")
    base = readln().toInt()
    println ("Enter the Height")
    height = readln().toInt()

    //process
    var computation1 = (base * height) / 2

    //output
    println("The Area Triangle is $computation1")

    //2. Assume a = 2 and b = 1
    println("")

    //declare all variables
    var a:Int = 2
    var b:Int = 1

    //input
    println ("Enter the a")
    a = readln().toInt()
    println ("Enter the a")
    b = readln().toInt()

    //process
    var computation2 = a*2 + 2*a*b - 4*(b+a)
    var computation3 = computation2 / 2

    //output
    println("The c is $computation3")


}
