package google_oop

data class Decoration(val rocks: String) {
}

fun main() {
    makeDecoration()
}

fun makeDecoration() {
    val decoration1 = Decoration("granite")
    val decoration2 = Decoration("granite")
    println(decoration1 == decoration2)
}
