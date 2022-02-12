package linkedin_course.basics

fun main() {
    sum1(2, 3)
    displayWithDefaults(2, 4)
    val res = displayWithDefaults(2, 4, "Wow")
    println(res)
}

fun sum1(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun sum2(num1: Int, num2: Int): Int = num1 + num2

fun sum3(num1: Int, num2: Int) = num1 + num2

fun displayWithDefaults(num1: Int, num2: Int, message: String = "Hi"): Int {
    println(message)
    return sum1(num1, num2)
}

