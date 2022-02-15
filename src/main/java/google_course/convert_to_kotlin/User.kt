package google_course.convert_to_kotlin

data class User(var firstName: String?, var lastName: String?)

fun main() {
    val user1 = User("Davinder Singh", "Kharoud")
    val user2 = User("Davinder Singh", "Kharoud")
    val structurallyEqual = (user1 == user2) //use variables to compare
    val referentiallyEqual = (user1 === user2) //use hashcode

    println(structurallyEqual)
    println(referentiallyEqual)
}