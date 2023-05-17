package casestudy.studentenrollmentsystem

class Student (
    val studentId: String,
    val name: String,
    val age: Int,
    val gender: String,
    val contactInfo: ContactInformation
) {
    val enrolledCourses: MutableList<Course> = mutableListOf()


    fun enrollCourse(course: Course) {
        if (enrolledCourses.size < course.maxStudents) {
            enrolledCourses.add(course)
            course.enrollStudent(this)
            println("Enrolled ${name} in ${course.courseName}")
        } else {
            println("Course ${course.courseName} is full. Enrollment failed.")
        }
    }

    fun withdrawCourse(course: Course) {
        enrolledCourses.remove(course)
        course.removeStudent(this)
        println("Withdrawn ${name} from ${course.courseName}")
    }

    fun generateCourseReport() {
        println("Courses enrolled by ${name}:")
        for (course in enrolledCourses) {
            println("${course.courseName} (Instructor: ${course.instructorName})")
        }
    }
}

data class ContactInformation(val phoneNumber: String, val emailAddress: String)
class Course(
    val courseId: String,
    val courseName: String,
    val instructorName: String,
    val maxStudents: Int
) {

    val  enrolledStudents: MutableList<Student> = mutableListOf()

    fun enrollStudent(student: Student) {
        enrolledStudents.add(student)
    }

    fun removeStudent(student: Student) {
        enrolledStudents.remove(student)
    }

    fun generateEnrolledStudentsReport() {
        println("Students enrolled in ${courseName}:")
        for (student in enrolledStudents) {
            println("${student.name} (Student ID: ${student.studentId})")
        }
    }
}
class EnrollmentSystem {
   val students: MutableList<Student> = mutableListOf()
   val courses: MutableList<Course> = mutableListOf()

    fun addStudent(student: Student) {
        students.add(student)
        println("Added student ${student.name} to the system.")
    }

    fun removeStudent(student: Student) {
        students.remove(student)
        println("Removed student ${student.name} from the system.")
    }

    fun enrollStudentInCourse(student: Student, course: Course) {
        student.enrollCourse(course)
    }

    fun withdrawStudentFromCourse(student: Student, course: Course) {
        student.withdrawCourse(course)
    }

    fun generateEnrolledStudentsReport(course: Course) {
        course.generateEnrolledStudentsReport()
    }

    fun generateCourseReport(student: Student) {
        student.generateCourseReport()
    }
}