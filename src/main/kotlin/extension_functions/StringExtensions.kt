package extension_functions

//Extensions only have access to public variables
fun String.hasSpaces(): Boolean {
    return any { it == ' ' }
}

fun String.hasSpaces2(): Boolean {
    return find { it == ' ' } != null
}

fun main() {
    val s = "hello"
    println(s.hasSpaces())
}