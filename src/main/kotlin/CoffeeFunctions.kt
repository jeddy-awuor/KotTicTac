fun main(){
    println("Enter your first number:")
    var num1Str = readln()
    var num1int = num1Str.toInt()

    println("Enter your second number:")
    var num2Str = readln()
    var num2int = num2Str.toInt()

    var myResult = add(num1int,num2int)  //add part returns an integer, not the function i.e it returns
    println("Result is $myResult")
}

data class CoffeeDetails( //data class holds only data, no functions, no other println no code
    val SugarCount:Int, )




fun add(num1:Int, num2:Int):Int{
    var result = num1 + num2
    return result   //this remains within the block to remove it check myResult
}

fun askdetails(){
    println("Who is this coffee for?")
    var name = readln()
    println("How many spoons of sugar do you need?")
    var sugarcount = readln().toInt()

    myCoffe(sugarcount, name)
}
fun myCoffe(sugarcount : Int, name : String) {
    if (sugarcount == 1) {
        println("$sugarcount spoon of sugar for $name.")
    } else if (sugarcount == 0) {
        println("No sugar for $name.")
    } else {
        println("$sugarcount spoons of sugar for $name.")
    }
}

