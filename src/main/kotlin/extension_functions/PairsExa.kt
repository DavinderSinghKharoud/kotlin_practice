package extension_functions

fun main() {
    partitions()
}

fun partitions() {
    //List.partition() returns two lists, one with the items where the condition is true, and the other for items where the condition is false.
    val fish = listOf("StartFish", "Shark", "CatFish")
    val twoLists = fish.partition { isFreshWater(it) }
    println("freshwater: ${twoLists.first}")
    println("saltwater: ${twoLists.second}")
}

fun isFreshWater(fish: String): Boolean {
    return fish.startsWith("s", true)
}
