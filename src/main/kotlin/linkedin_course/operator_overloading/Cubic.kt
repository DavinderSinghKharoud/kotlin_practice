package linkedin_course.operator_overloading

data class Cubic(val num1: Int, val num2: Int, val num3: Int) {
    operator fun plus(other: Cubic): Cubic {
        return Cubic(other.num1 + num1, other.num2 + num2, other.num3 + num3)
    }

    operator fun minus(other: Cubic): Cubic {
        return Cubic(other.num1 - num1, other.num2 - num2, other.num3 - num3)
    }
}

fun main() {
    val cube1 = Cubic(1, 2, 3)
    val cube2 = Cubic(1, 2, 3)
    println(cube1 + cube2)
    println(cube1 - cube2)
}