package practiceactivities


fun main(){
    var counter:Int = 0
    var counter1:Int = 0
    var number:Double = 0.00
    var average:Double = 0.00

    while(counter < 5){
        counter1++
        println("Enter Number $counter1 :")
        number = readln().toDouble()

        if(counter<6){
            average +=number/5
        }

        counter++
    }
    println("The Average is ${String.format("%,.2f", average)}")

}