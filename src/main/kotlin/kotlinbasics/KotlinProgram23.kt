package kotlinbasics

fun main(){
    //arraylist
    var names = ArrayList<String>()
    println("enter name 1:")
    names.add(readln())
    println("enter name 2:")
    names.add(readln())
    println("enter name 3:")
    names.add(readln())

    var ctr:Int = 0
    while(ctr < names.size){
        println(names[ctr])
        ctr++
    }
}