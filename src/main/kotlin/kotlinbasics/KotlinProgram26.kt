package kotlinbasics

fun main(){

    //maps - key pair structure immutable (pwedeng negatives, letters char,)
    //<key> to <value>
    //traverse
    var fruits = mapOf(1 to "apple", 2 to "banana", 3 to "grapes")
    println(fruits[1])
    println(fruits)

    for((id, element) in fruits){
        println("key is $id and Value is $element")

    }

    var fruits2 = mutableMapOf<Int, String>()
    fruits2[1] = "Melon"
    fruits2[2] = "Watermelon"
    fruits2[5] = "Papaya"
    println(fruits2)

    fruits2.remove( 2)
    fruits2.replace(5, "Sampaloc")
    println(fruits2)

}