package kotlinbasics

fun main(){
    var name:String = "John Weak"
    //displaying variable value using string interpolation
    println("Hello $name")
    var age:Int = 36
    var salary:Double = 1000.0
    var skillLevel:Char = 'S'
    var isActive:Boolean = true
    println("His age is $age")
    println("His salary is $salary")
    println("His Skill Level is $skillLevel")
    println("He is currently active? $isActive")
}