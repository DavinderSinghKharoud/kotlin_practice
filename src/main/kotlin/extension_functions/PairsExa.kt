package extension_functions

fun main() {
    println(ConstantsTest.NUMBER)
}

fun listCollections() {
    val list = listOf("a", "bb", "cc")
    println(list.sumBy { it.length })

    val map: Map<String, String> =
        mapOf("white spots" to "Inch") //Use linked hash map in built (performance regression)
    val hashMap: Map<String, String> = hashMapOf("white spots" to "Inch")

    println(map.getOrDefault("bloating", "sorry, I don't know"))
    println(map.getOrElse("bloating") { "sorry, I don't know" }) //With lambda

}

fun triples() {
    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.first)
}

fun partitions() {
    //List.partition() returns two lists, one with the items where the condition is true, and the other for items where the condition is false.
    val fish = listOf("StartFish", "Shark", "CatFish")
    val twoLists = fish.partition { isFreshWater(it) }
    println("freshwater: ${twoLists.first}")
    println("saltwater: ${twoLists.second}")

    val equipment = "fish net" to "catching fish"
    println("${equipment.first} used for ${equipment.second}")
}

fun isFreshWater(fish: String): Boolean {
    return fish.startsWith("s", true)
}

class ConstantsTest {
    companion object {
        const val NUMBER = 2
    }
}