package google_course.convert_to_kotlin

//Singleton
object Repository {
    private val _users = mutableListOf<User>() //The convention for backing properties is to use a leading underscore.

    /**
     * With the above change, the private _users property becomes the backing property for the public user property.
     * Outside of the Repository class, the _users list is not modifiable, as consumers of the class can access the list only through users.
     */
    val users: List<User>
        get() = _users


    val formattedUserNames: List<String>
        get() {
            return _users.map { user -> user.userFormattedName }
        }

    //companion object {
    //It is kind of static block in java
    // keeping the constructor private to enforce the usage of getInstance
    init {
        val user1 = User("Jane", "")
        val user2 = User("John", null)
        val user3 = User("Anne", "Doe")
        _users.add(user1)
        _users.add(user2)
        _users.add(user3)
    }
}