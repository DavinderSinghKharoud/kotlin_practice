package linkedin_course.generics

fun <T : Comparable<T>> getSmaller(param1: T, param2: T): T {
    val result = param1.compareTo(param2)
    return if(result > 0) param2 else param1
}

fun main(args: Array<String>) {
    println("getSmaller")

    // Please add the getSmaller function above the linkedin_course.basics.main function
    val minInt: Int = getSmaller(42, 99)
    val minDouble: Double = getSmaller(9.807, 3.14159)
    val minString: String = getSmaller("kitten", "kittens")

    println("The min Int = $minInt")
    println("The min Double = $minDouble")
    println("The min String = $minString")
}