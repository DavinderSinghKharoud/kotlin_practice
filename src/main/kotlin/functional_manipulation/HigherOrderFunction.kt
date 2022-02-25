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


}

fun main() {
//    fishExamples()
//    println(testRun())
    testApply()
}

fun testApply() {
    //The apply() function is similar to run(), but it returns the changed object it was applied to instead of the result of the lambda. This can be useful for calling methods on a newly created object.
    val fish = Fish("splashy").apply { name = "Fish" }
    println(fish.name)
    //Note: run() and apply() are similar, but run() returns the result of applying the function, and apply() returns the object after applying the function.
}

private fun testRun(): String {
    //The run() function is an extension that works with all types. It takes one lambda as its argument and returns the result of executing the lambda.
    val fish = Fish("splashy")
    return fish.run {
        name
    }
}