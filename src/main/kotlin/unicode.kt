fun main() {
    val mycopyright = '\u00AE' //nimetoa online. val is immutable
    println(mycopyright)

    var str = "abcd 1234. We can store very long paragraphs inside here"
//    for (c in str){
     println(str)
     println(str + " " + "now you know")
     println(str.uppercase())

    var age = 0
    println("Enter your age")
    // var enteredage = readln()
    //var age = enteredage.toInt()
    age = readln().toInt()
    println(age)
}