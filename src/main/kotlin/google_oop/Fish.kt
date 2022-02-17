package google_oop

class Shark : AquariumFish(), FishAction {
    override val color: String = "grey"
    override fun eat() {
        println("Eat other fishes")
    }
}

class Plecostomus : FishAction, FishColor {
    override val color = "gold"
    override fun eat() {
        println("Eat other algae")
    }
}

fun makeFish() {
    val shark = Shark()
    val plecostomus = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("plecostomus: ${plecostomus.color}")
    plecostomus.eat()

}

object GoldColor : FishColor {
    override val color: String
        get() = "Gold"
}

fun main() {
    makeFish()
}
