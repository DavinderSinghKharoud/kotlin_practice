package java_interop

import com.Animal

fun javaIntrep() {
    val frisky = Animal("Frisky", "cat", 10)
    println(frisky.show())

    frisky.weight = 10 //can be changed if property has getter
    //frisky.kind = "Hello" //can't be changed because there is no setter

}
fun main() {

}