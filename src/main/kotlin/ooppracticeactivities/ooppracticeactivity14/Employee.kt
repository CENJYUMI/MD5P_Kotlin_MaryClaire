package ooppracticeactivities.ooppracticeactivity14

open class Employee (private var name: String, private var age: Int) {


    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getAge(): Int {
        return age
    }
    fun setAge(age: Int) {
        this.age = age
    }

    open fun displayInfo() {
        println("Name: ${getName()}")
        println("Age: ${getAge()}")

    }
}