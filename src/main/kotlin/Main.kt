
fun main() {
    print("Hello world")

    var sentence = "I'm a sentence"
    val pi = 1.9F
    val number: Int = 123

    ifExpression()
}

fun ifExpression(){
    /*
    1] If is an expression not an statement, which means it return an value
    2] Result of the If expression can be assigned to a variable
    3] It should have else block
     */
    val small = 1
    val big = 2
    val lowest = if(small < big) small else big
    println(lowest)

    val smallNumberCheck = if(small > 20){
        println("Small number is greater than 20")
        true
    }else{
        println("Small number is less than 20")
        false
    }

    println(smallNumberCheck)
}