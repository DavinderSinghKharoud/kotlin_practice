package google_course.convert_to_kotlin

import java.util.*

//Singleton
object Repository {
    private var users = mutableListOf<User>()
    fun getUsers(): List<User> {
        return users
    }

    val formattedUserNames: List<String>
        get() {
            val userNames = ArrayList<String>(users.size)
            for ((firstName, lastName) in users) {
                val name: String = if (lastName != null) {
                    if (firstName != null) {
                        "$firstName $lastName"
                    } else {
                        lastName
                    }
                } else firstName ?: "Unknown" //Elvis operator: If variable is not null it will be returned else variable to the right

                userNames.add(name)
            }
            return userNames
        }

    //companion object {
    //It is kind of static block in java
    // keeping the constructor private to enforce the usage of getInstance
    init {
        val user1 = User("Jane", "")
        val user2 = User("John", null)
        val user3 = User("Anne", "Doe")
        users.add(user1)
        users.add(user2)
        users.add(user3)
    }
}