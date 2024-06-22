import kotlin.random.Random

fun main() {
    var compchoice= ""
    var playerchoice = ""
    println("Choose between Rock, Paper ,Scissors")

    playerchoice = readln()

    val randomnumber = (1..3).random( )
    // Generate a random number between 1 and 10
    //val randomNumber = Random.nextInt(1, 11) hower inclusive of 1 and exclusive of ten

    when (randomnumber) {
        1 -> {
            compchoice = "Rock"
        }
        2 -> {
            compchoice = "Paper"
        }
        3 -> {
            compchoice = "Scissors"
        }
    }

    /*when{
        randomnumber == 1 -> {
            println("Tie")
        }
    }*/

    /*val obj: Any = "Hello"
    when (obj) {
        is String -> println("It's a string")
        is Int -> println("It's an integer")
        else -> println("Unknown type")

        (is) is only used to check type
    }*/
    /*
    val score = 85
    when {
        score >= 90 -> println("Excellent")
        score in 80..89 -> println("Good")
        score in 70..79 -> println("Average")
        else -> println("Needs Improvement")
    }
    in is used for range
    */

    println(compchoice)

    val winner = when{
        playerchoice == compchoice -> "Tie"
        playerchoice == "Rock" && compchoice == "Scissors" -> "Player"
        playerchoice == "Paper" && compchoice == "Rock" -> "Player"
        playerchoice == "Scissors" && compchoice == "Paper" -> "Player"
        else -> "Computer" //because of this if the user enters a wrong input/'cheats' the comp wins by default
    }
    if (winner == "Tie"){
        println("It's a tie!")
    }else{
        println("$winner won")
    }
//    if (winner == "Tie"){
//        println("It's a tie!")
//    }else if (winner == "Player"){
//        println("You won!")
//    }else{
//        println("Computer won! ")
//    }
}