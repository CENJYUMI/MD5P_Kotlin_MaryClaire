package kotlinoop.kotlinoop9

class Employee (private var empID:String, private var salary:Double) : Person() {

    fun setEmpID(empID: String) {
        this.empID = empID
    }
    fun setSalary(salary: Double) {
        this.salary = salary
    }

    fun getEmpID(): String {
        return empID

    }
    fun getSalary(): Double {
        return salary

    }

    fun displayEmployeeDetails(){
        println("Employee name is ${getName()}")
        println("Employee age is ${getAge()}")
        println("Employee id is $empID")
        println("Employee salary is P${String.format("%,.2f",salary)}")

    }
}
