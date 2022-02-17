package google_oop

class Shark : AquariumFish(), FishAction {
    override val color: String = "grey"
    override fun eat() {
        println("Eat other fishes")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor) : FishAction, FishColor by fishColor {
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

    println(plecostomus.color)

}

object GoldColor : FishColor {
    override val color: String
        get() = "Gold"
}

fun main() {
    makeFish()
}
