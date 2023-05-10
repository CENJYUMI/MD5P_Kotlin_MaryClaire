package kotlinbasics

fun main() {
    //for loop - no need var
    for(counter in 5..10){
        if(counter == 7){
            continue // skip iteration
        }
        println(counter)
    }
    println("Hello World!")
}