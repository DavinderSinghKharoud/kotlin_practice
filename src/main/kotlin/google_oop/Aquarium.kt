package google_oop

//Need to add open if class can act as parent class( parentClass <-- subClass )
open class Aquarium(var length: Int = 100, var width: Int = 20, open var height: Int = 40) {

    open fun printSize() {
        println(
            "Width: $width cm " +
                    "Length: $length cm " +
                    "Height: $height cm "
        )
    }
}

fun main() {
    buildAquarium()
}

class TowerTank(override var height: Int, var diameter: Int) :
    Aquarium(height = height, width = diameter, length = diameter)

class Fish : Aquarium() {
    override fun printSize() {
        println("Fish size")
    }
}

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
}