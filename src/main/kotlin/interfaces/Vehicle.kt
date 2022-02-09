package interfaces

//https://blog.kotlin-academy.com/abstract-class-vs-interface-in-kotlin-5ab8697c3a14
/**
 *
What is the difference between abstract class and interface?” — this is one of the most popular questions during programmer recruiting process. Popular answers are:
An interface cannot hold state
Classes can have actual functions
We can implement multiple interfaces and only one class

I will show that those answers are not really true. Interfaces can have properties and can hold state, but not using fields. They can have functions with actual bodies, as long as they are not final. True significant differences between abstract classes and interfaces are:

Interfaces cannot have fields
We can extend only one class, and implement multiple interfaces
Classes have constructors

 */
interface Vehicle {
    val makeName: String
        get() = "Hel"

    fun go() {
        println("Vroom, run")
    }

    fun stop() {
        println("Screening")
    }

    fun getMpg(): Int {
        return 50
    }

    fun getDoors(): Int

}