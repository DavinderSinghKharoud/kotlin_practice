object MySingleton{
    private var temperatures = arrayOf(10, 20, 30)
    fun getLastTemp() = temperatures.last()
}

fun main() {
    val person = Person("Davinder Singh", "Kharoud")
    val person2 = Person("Davinder", "Kharoud", "Singh")

    val location = object {
        var xPosition = 200
        var yPosition = 400
        fun println(){
            println("Position = ($xPosition $yPosition)")
        }
    }
    println("${location.xPosition}, ${location.yPosition}")
    location.println()

    val temperature = MySingleton.getLastTemp()
    println("Last temp = $temperature degrees")
}