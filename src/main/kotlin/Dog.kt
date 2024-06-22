class Dog (val name : String, val breed: String, var age: Int){
    //if i was to set that var age : Int = 0 then by default ukirun ln 4 inakupea daisy's age as 0 but you can override this by puttin 2 kwa hio var myDog as age
    init {  //on calling obj this is the first thing to pop up everytime bora function is run
        bark()
    }
    fun bark(){
        println("Woof Woof")
    }
}
