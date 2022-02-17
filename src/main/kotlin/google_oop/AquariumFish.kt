package google_oop

abstract class AquariumFish : FishAction {
    abstract val color: String
    override fun eat() {
        println("Yummy")
    }
}

interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim() {
        println("swim")
    }
}