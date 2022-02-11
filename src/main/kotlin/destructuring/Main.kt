package destructuring

import operator_overloading.Position

fun main() {
    val position = Position(100, 200)
    val (xPosition, yPosition) = position
    println("xPos: $xPosition yPos: $yPosition")

    println("c1 = ${position.component1()}") //By default exist there component1()
}