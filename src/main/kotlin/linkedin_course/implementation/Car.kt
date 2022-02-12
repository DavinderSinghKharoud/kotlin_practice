package linkedin_course.implementation

import linkedin_course.interfaces.Vehicle

class Car : Vehicle {
    override val makeName: String
        get() = "Ford"

    override fun getDoors(): Int {
        return 4
    }
}

fun main() {
    val myCar = Car()
    myCar.go()
    println("doors: $myCar.getDoors()")
}