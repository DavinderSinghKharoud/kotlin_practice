package google_course.convert_to_kotlin

//Singleton
object Repository {
    private var users = mutableListOf<User>()
    fun getUsers(): List<User> {
        return users
    }

    val formattedUserNames: List<String>
        get() {
            return users.map { user ->
                val name: String = if (user.lastName != null) {
                    if (user.firstName != null) {
                        "$user.firstName $user.lastName"
                    } else {
                        user.lastName ?: "Unknown"
                    }
                } else
                    user.firstName ?: "Unknown" //Elvis operator: If variable is not null it will be returned else variable to the right
                name
            }.toList()
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