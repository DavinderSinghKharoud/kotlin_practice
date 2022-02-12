package linkedin_course.operator_overloading

data class Position(var x: Int, var y: Int) { //Only variables inside the primary constructor are used for equals and Hashcode
    /**
     * Operator overloading
     * Expression
    Translated to
    a + b
    a.plus(b)
    a - b
    a.minus(b)
    a * b
    a.times(b)
    a / b
    a.div(b)
    a % b
    a.rem(b)
    a..b
    a.rangeTo(b)
     */
    operator fun plus(other: Position): Position {
        return Position(other.x + x, other.y + y)
    }


}

fun main() {
    val p1 = Position(100, 100)
    val p2 = Position(200, 200)
    val p3 = p1 + p2
    println(p3)
}