package google_kotlin_from_java

data class User @JvmOverloads constructor(
    @JvmField val id: Int,
    @JvmField val username: String,
    @JvmField val displayName: String = username.toTitleCase(),
    @JvmField val groups: List<String> = listOf("guest")
) {
    @get: JvmName("hasSystemAccess")
    val hasSystemAccess
//        @JvmName("hasSystemAccess")
        get() = "sys" in groups
}
