import kotlin.math.abs

fun main() {
    whileLoop()
}

fun whileLoop() {
    var x = 0
    while (x < 10) {
        println("x = $x")
        x += 3
    }

    //Will run at least one
    do {
        println("x = $x")
        x -= 3
    } while (x > 0)
}

fun whenExpression() {
    var burgersOrdered = 2
    when (burgersOrdered) {
        0 -> println("Not hungry")
        1, 2 -> println("Hungry")
        3 -> println("Very hungry")
        else -> println("Are you sure")
    }

    burgersOrdered = -1
    when (burgersOrdered) {
        abs(burgersOrdered) -> println("Orders 0 or more burgers please")
        else -> {
            println("Ordered less than 0")
        }
    }

    when (burgersOrdered) {
        0 -> println("We need orders")
        in 1..4 -> println("Got some orders")
        in 5..9 -> println("Businees is up")
        else -> {
            println("Not sure")
        }
    }

    when {
        burgersOrdered <= 0 -> println("None ordered")
        burgersOrdered % 2 == 1 -> println("Odd number ordered")
        burgersOrdered % 2 == 0 -> println("Even number ordered")
    }

}

fun ifExpression() {
    /*
    1] If is an expression not an statement, which means it return an value
    2] Result of the If expression can be assigned to a variable
    3] It should have else block
     */
    val small = 1
    val big = 2
    val lowest = if (small < big) small else big
    println(lowest)

    val smallNumberCheck = if (small > 20) {
        println("Small number is greater than 20")
        true
    } else {
        println("Small number is less than 20")
        false
    }

    println(smallNumberCheck)
}