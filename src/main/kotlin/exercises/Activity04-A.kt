package exercises

class Student(
    val firstName: String,
    val lastName: String,
    val nickName: String,
    val id: String,
    val yearEnrolled: Int
)

class StudentEnrollmentSystem {
    private val students: MutableMap<String, Student> = mutableMapOf()

    fun addStudent(student: Student) {
        students[student.id] = student
    }

    fun removeStudent(student: Student) {
        students.remove(student.id)
    }

    fun searchStudentWildSearch(searchString: String, searchField: String): List<Student> {
        val matchedStudents = mutableListOf<Student>()
        for (student in students.values) {
            val fullName = "${student.firstName} ${student.lastName} ${student.nickName}"
            when (searchField) {
                "lastname" -> {
                    if (student.lastName.contains(searchString, ignoreCase = true)) {
                        matchedStudents.add(student)
                    }
                }
                "firstname" -> {
                    if (student.firstName.contains(searchString, ignoreCase = true)) {
                        matchedStudents.add(student)
                    }
                }
                "nickname" -> {
                    if (student.nickName.contains(searchString, ignoreCase = true)) {
                        matchedStudents.add(student)
                    }
                }
            }
        }
        return matchedStudents
    }
}
fun main() {
    val enrollmentSystem = StudentEnrollmentSystem()

    val student1 = Student("Charles", "Jayvin", "CJ", "S001", 2021)
    val student2 = Student("Maryden", "Clarisse", "Timy", "S002", 2021)
    val student3 = Student("Cheska", "Denisse", "Cheska", "S003", 2022)

    enrollmentSystem.addStudent(student1)
    enrollmentSystem.addStudent(student2)
    enrollmentSystem.addStudent(student3)

    val searchResults = enrollmentSystem.searchStudentWildSearch("CJ", "nickname")
    println("Search Results:")
    for (student in searchResults) {
        println("Name: ${student.firstName} ${student.lastName} (${student.nickName}) - ID: ${student.id} ")
        println("Year Enrolled : ${student.yearEnrolled}")
    }
}
