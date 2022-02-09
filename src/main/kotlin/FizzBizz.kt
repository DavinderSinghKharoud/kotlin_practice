fun main() {
    for (num in 1..105) {
        print("$num: ")
        when {
            num % 3 == 0 -> println("Fizz")
            num % 5 == 0 -> println("buzz")
            else -> println("Fizz bizz")
        }
    }
}