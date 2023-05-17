package casestudy.studentenrollmentsystem

fun main(){
    val enrollmentSystem = EnrollmentSystem()

    //Create student
    val student1 = Student(
        "S0001",
        "Charles Jayvin",
        16,
        "Male",
        ContactInformation("1234567890", "Charlesjayvin@gmail.com")
    )
    val student2 = Student(
        "S0002",
        "Maryden Clarisse",
        16,
        "Female",
        ContactInformation("2468101214", "marydenclarisse@gmail.com")
    )
    val student3 = Student(
        "S0003",
        "Cheska Denisse",
        16,
        "Female",
        ContactInformation("36912151821", "cheskadenisse@gmail.com")
    )
    val student4 = Student(
        "S0003",
        "Markief Haven",
        16,
        "Male",
        ContactInformation("987654321", "markeifhaven@gmail.com")
    )
    val student5 = Student(
        "S0005",
        "Markuz Elio",
        16,
        "Male",
        ContactInformation("1020304050", "markuzelio@gmail.com")
    )
    val student6 = Student(
        "S0006",
        "Avery Reign",
        16,
        "Female",
        ContactInformation("1122334455", "averyreign@gmail.com")
    )
    val student7 = Student(
        "S0007",
        "Koko",
        16,
        "Male",
        ContactInformation("2244668810", "koko@gmail.com")
    )
    val student8 = Student(
        "S0008",
        "Kobe",
        16,
        "Male",
        ContactInformation("987456321", "kobe@gmail.com")
    )
    val student9 = Student(
        "S0009",
        "Pio",
        16,
        "Male",
        ContactInformation("321456987", "pio@gmail.com")
    )
    val student10 = Student(
        "S0010",
        "Elisa",
        16,
        "Female",
        ContactInformation("147852369", "elisa@gmail.com")
    )

    // Create courses
    val course1 = Course(
        "C001",
        "Business Administration",
        "Prof. Ramos",
        2)
    val course2 = Course(
        "C002",
        "Education",
        "Prof. Lusterio",
        2)
    val course3 = Course(
        "C003",
        "Nursing",
        "Prof. Osongco",
        2)
    val course4 = Course(
        "C004",
        "Engineering",
        "Prof. Ballesteros",
        2)
    val course5 = Course(
        "C005",
        "Information Technology",
        "Prof. Rondilla",
        2)

    enrollmentSystem.addStudent(student1)
    enrollmentSystem.addStudent(student2)
    enrollmentSystem.addStudent(student3)
    enrollmentSystem.addStudent(student4)
    enrollmentSystem.addStudent(student5)
    enrollmentSystem.addStudent(student6)
    enrollmentSystem.addStudent(student7)
    enrollmentSystem.addStudent(student8)
    enrollmentSystem.addStudent(student9)
    enrollmentSystem.addStudent(student10)
    println("")
    enrollmentSystem.enrollStudentInCourse(student1,course5)
    enrollmentSystem.enrollStudentInCourse(student2,course4)
    enrollmentSystem.enrollStudentInCourse(student3,course3)
    enrollmentSystem.enrollStudentInCourse(student4,course2)
    enrollmentSystem.enrollStudentInCourse(student5,course1)
    enrollmentSystem.enrollStudentInCourse(student6,course1)
    enrollmentSystem.enrollStudentInCourse(student7,course2)
    enrollmentSystem.enrollStudentInCourse(student8,course3)
    enrollmentSystem.enrollStudentInCourse(student9,course4)
    enrollmentSystem.enrollStudentInCourse(student10,course5)
    println("")
    enrollmentSystem.removeStudent(student5)
    println("")
    enrollmentSystem.withdrawStudentFromCourse(student5,course1)
    println("")

    println("List of Students with Enrolled Courses:")
    for (student in enrollmentSystem.students) {
        println("Student: ${student.name}")
        student.generateCourseReport()
        println()
    }

}