package google_course.convert_to_kotlin

data class User2(var firstName: String?, var lastName: String?)

/**
 * To extend the functionality of a class, either because we don't own the class or because it's not open to inheritance, Kotlin created special declarations called extensions.
 * Kotlin supports extension functions and extension properties.
 */
// extension function
fun User2.getFormattedName(): String {
    return if (lastName != null) {
        if (firstName != null) {
            "$firstName $lastName"
        } else {
            lastName ?: "Unknown" //Elvis operator: If variable is not null it will be returned else variable to the right
        }
    } else {
        firstName ?: "Unknown"
    }
}

// extension property
val User2.userFormattedName: String
    get() {
        return if (lastName != null) {
            if (firstName != null) {
                "$firstName $lastName"
            } else {
                lastName ?: "Unknown"
            }
        } else {
            firstName ?: "Unknown"
        }
    }


fun main() {
    val user1 = User2("Davinder Singh", "Kharoud")
    val user2 = User2("Davinder Singh", "Kharoud")
    val structurallyEqual = (user1 == user2) //use variables to compare
    val referentiallyEqual = (user1 === user2) //use hashcode

    println(structurallyEqual)
    println(referentiallyEqual)

    println(user1.getFormattedName())
}

/*
 Java              |        Kotlin
 equals()                     ==
 ==                           ===
 */
