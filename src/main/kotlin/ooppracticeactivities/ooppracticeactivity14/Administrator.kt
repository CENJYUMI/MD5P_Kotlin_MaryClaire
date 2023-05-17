package ooppracticeactivities.ooppracticeactivity14

class Administrator (name:String, age:Int, private val department:String) : Employee(name, age) {

    override fun displayInfo(){
        super.displayInfo()
        println("Role: Administrator")
        println("Department: $department")
    }
}