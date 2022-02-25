package generics

//in and out are about the TYPES of variables. in and out make sure that when working with generic types, only safe types are passed in and out of functions.
class Aquarium2<out T : WaterSupply>(val waterSupply: T)

//Kotlin can ensure that addItemTo() won't do anything type unsafe with the generic WaterSupply, because it's declared as an out type.
//If you remove the out keyword, the compiler will give an error when calling addItemTo(), because Kotlin can't ensure that you are not doing anything unsafe with the type.
fun addItemTo(aquarium: Aquarium2<WaterSupply>) = println("item added")

fun genericExample() {
    val aquarium = Aquarium2(TapWater())
    addItemTo(aquarium)
}

fun main() {
//    genericExample()
    genericExample3()
}

interface Cleaner<in T : WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalCleaners()
    }
}

class Aquarium3<out T : WaterSupply>(val watterSupply: T) {
    fun addWater(cleaner: Cleaner<T>) {
        if (watterSupply.needsProcessing) {
            cleaner.clean(watterSupply)
        }
        println("water added")
    }
}

fun genericExample3() {
    val cleaner = TapWaterCleaner()
    val aquarium = Aquarium3(TapWater())
    aquarium.addWater(cleaner)
}