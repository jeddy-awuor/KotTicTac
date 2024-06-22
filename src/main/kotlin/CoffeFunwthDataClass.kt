
data class ChaiDetails( //note it only holds data
    val jina: String,
    val sukariCount : Int,
    val size: String,
    val creamAmount : String
)
fun main() {
    val myChai= ChaiDetails("Denis", 0,"large", "no")
    makemyChai(myChai)
    val myChai2 = ChaiDetails("Jeddy", 2, "medium", "yes")
    makemyChai(myChai2)
}

fun makemyChai(chaiDetails: ChaiDetails){
    if (chaiDetails.sukariCount == 1){
        println("Coffee for ${chaiDetails.jina} with ${chaiDetails.sukariCount} spoon of sugar," +
                " ${chaiDetails.size} size, and ${chaiDetails.creamAmount} cream.")
    }
    else if (chaiDetails.sukariCount == 0){
        println("Coffee for ${chaiDetails.jina} with ${chaiDetails.sukariCount} spoons of sugar," +
                " ${chaiDetails.size} size, and ${chaiDetails.creamAmount} cream.")
    }
    else {
        println("Coffee for ${chaiDetails.jina} with ${chaiDetails.sukariCount} spoons of sugar," +
                " ${chaiDetails.size} size, and ${chaiDetails.creamAmount} cream.")
    }
}