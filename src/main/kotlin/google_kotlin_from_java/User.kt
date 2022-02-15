package google_kotlin_from_java

data class User(
    val id: Int,
    val username: String,
    val displayName: String = username.toTitleCase(),
    val groups: List<String> = listOf("guest")
) {
    val hasSystemAccess
        get() = "sys" in groups
}
