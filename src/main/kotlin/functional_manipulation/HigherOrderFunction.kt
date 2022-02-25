package functional_manipulation

data class Fish(var name: String)

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

fun fishExamples() {
    val fish = Fish("splashy")
    with(fish.name) {
        //with() function lets you make one or more references to an object or property in a more compact way.
        //Object does not really change, Only changes exist in this block
        println(capitalize())
        toLowerCase()
    }

    println(fish)
}

fun main() {
    fishExamples()
}