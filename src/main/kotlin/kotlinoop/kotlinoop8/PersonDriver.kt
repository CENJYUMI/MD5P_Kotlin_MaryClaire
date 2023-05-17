package kotlinoop.kotlinoop8


fun main(){
    var person = Person()
    person.setName("Peter")
    person.setAge(21)

    println(person.getName())
    println(person.getAge())

    var person2 = Person()
    person.setName("Claire")
    person.setAge(20)

    println(person.getName())
    println(person.getAge())

}