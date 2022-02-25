package extension_functions

class AquariumPlanet(val color: String, private val size: Int)

fun AquariumPlanet.isRed() = color == "Red"
val AquariumPlanet.isGreen: Boolean
    get() = color == "Green"

fun AquariumPlanet?.pull() {
    this?.apply {
        println("value is not null")
    }
}

fun main() {
    val aquariumPlanet = AquariumPlanet("Red", 30)
    println(aquariumPlanet.isRed())

    val plant: AquariumPlanet? = null
    plant.pull()
}
//fun AquariumPlanet.isBig() = size > 50// Compilation error