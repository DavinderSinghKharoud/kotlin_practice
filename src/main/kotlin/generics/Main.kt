package generics

fun main() {
    val maxInt: Int = max(1, 2)
    val maxLong: Long = max(1L, 2L)
    val name: String = max("Davinder", "Singh")

    println("MaxInt $maxInt")
    println("MaxLong $maxLong")
    println("Name $name")
}