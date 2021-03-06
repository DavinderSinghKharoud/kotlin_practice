package google_kotlin_from_java

import java.io.File
import java.io.FileNotFoundException

object Repository {
    //const are primitives, such as int, float, and String
    const val BACKUP_PATH =
        "/backup/user.repo"  //'@JvmField' might be used instead of const, but it is a performance overhead

    private val _users = mutableListOf<User>()
    private var _nextGuestId = 1000

    @JvmStatic //The @JvmStatic annotation tells the Kotlin compiler to generate a static version of the annotated member or method.
    val users: List<User>
        get() = _users

    @JvmStatic
    val nextGuestId
        get() = _nextGuestId++

    init {
        _users.add(User(100, "josh", "Joshua Calvert", listOf("admin", "staff", "sys")))
        _users.add(User(101, "dahybi", "Dahybi Yadev", listOf("staff", "nodes")))
        _users.add(User(102, "sarha", "Sarha Mitcham", listOf("admin", "staff", "sys")))
        _users.add(User(103, "warlow", groups = listOf("staff", "inactive")))
    }

    @JvmStatic
    @Throws(FileNotFoundException::class) //Kotlin does not have checked exceptions, we can use throws to notify java users
    fun saveAs(path: String?): Boolean {
        val backupPath = path ?: return false

        val outputFile = File(backupPath)
        if (!outputFile.canWrite()) {
            throw FileNotFoundException("Could not write to file: $backupPath")
        }
        // Write data...
        return true
    }

    @JvmStatic
    fun addUser(user: User) {
        // Ensure the user isn't already in the collection.
        val existingUser = users.find { user.id == it.id }
        existingUser?.let { _users.remove(it) }
        // Add the user.
        _users.add(user)
    }
}