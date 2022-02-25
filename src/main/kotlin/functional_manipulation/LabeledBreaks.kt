package functional_manipulation

fun labels() {
    outerLoop@ for (i in 0 until 100) {
        println(i)
        for (j in 1..100) {
            if (i > 10) break@outerLoop
        }
    }
}

fun main() {
    labels()
}