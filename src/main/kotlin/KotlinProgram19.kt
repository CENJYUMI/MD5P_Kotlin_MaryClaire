fun main(){
    //repeat statement
    repeat(5){
        println("Enter number ${it+1}")
        var num = 0
        num = readln().toInt()
    }

    repeat(5){counter ->
        println("Enter number ${counter+1}")
    }
}