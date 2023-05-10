package kotlinoop.kotlinoop1

class Person1C(var name:String, var age:Int){
    fun walk(){
        println("A person walks")
    }

    fun eat(){
        println("A person eats")
    }

    fun sayHello(){
        println("$name says Hello!")
    }
}
fun main(){
    //instantiation - creating objects from a class
    val pedroObject = Person1C("Claire",18)
    println(pedroObject.name)
    println(pedroObject.age)

    pedroObject.sayHello()

}