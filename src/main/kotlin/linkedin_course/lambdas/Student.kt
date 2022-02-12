package linkedin_course.lambdas

data class Student(val name: String, val age: Int)

fun getStudents(): List<Student> {
    return listOf(
        Student("Ginger", 12),
        Student("Davinder Singh", 25)
    )
}


fun main() {
    val students = getStudents()
    println(students)
    val combos = students.map { it.name + " : " + it.age }
    println(combos)

    println("The oldest student: ${students.maxByOrNull { it.age }}")
}
