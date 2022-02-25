package generics

open class WaterSupply(var needsProcessing: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}

//Set Any explicitly to not allow null values
//class Aquarium<T : Any>(val waterSupply: T)
class Aquarium<T : WaterSupply>(val waterSupply: T) {
    fun addWater() {
        //check() acts as an assertion and will throw an IllegalStateException if its argument evaluates to false
        check(!waterSupply.needsProcessing) { "water supply needs processing first" }
        println("adding water from $waterSupply")
    }
}

fun genericExample1() {
    val aquarium = Aquarium(TapWater())
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
}

fun main() {
    genericExample2()
}

fun genericExample2() {
    val aquarium = Aquarium(LakeWater())
    aquarium.waterSupply.filter()
    aquarium.addWater()
}
