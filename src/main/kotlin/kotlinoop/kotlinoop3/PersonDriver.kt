package kotlinoop.kotlinoop3

fun main(){
    //1st Constructor
    println("First Constructor")
    val person1 = Person()
    println(person1.name)
    println(person1.age)

    println("\nSecond Constructor")
    val person2 = Person("Peter",21)
    println(person2.name)
    println(person2.age)

    println("\nThird Constructor")
    val person3 = Person("Peter")
    println(person3.name)
    println(person3.age)

    println("\nFourth Constructor")
    val person4 = Person(21)
    println(person4.name)
    println(person4.age)
}