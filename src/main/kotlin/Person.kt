
//class Person (firstName: String, lastName: String) {
class Person internal constructor(firstName: String, lastName: String) {
    init {
        println("$firstName $lastName")
    }

    //For second constructor, we must need to call the primary constructor
    constructor(firstName: String, lastName: String, middleName: String) : this(firstName, lastName) {

    }


}