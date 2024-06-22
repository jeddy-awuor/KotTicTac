fun main(args: Array<String>) {
    val myname = "Jeddy"
    println(myname)
    var myDog = Dog("Daisy", "pitbull", 2)
    //Note you dont have to do println(daisy) as it already runs the woof woof by just calling it ie just run ln 4 pekee
    println("My dog's name is ${myDog.name}" +  "she is ${myDog.age} years old.") //have to add braces when string manipulation
    println("Adding an year to daisy")
    myDog.age = 4
    println(myDog.age)

    val my2car = Car("Ford1", "Mustang2", 1990)
    var myDetails = my2car.detail()


    println(my2car) //returns nam of class and hash code of the object to counter this go into the class
    //   override fun toString(): String {
    //        return "$brand $model,$year"
    //    }
    //in main.kt  println(my2car) now prints "ford1,  $mustang2, 1990"

    val myCar = Car("Ford", "Mustang", 1995)
    println("My car is a ${myCar.brand}")

    
    val myBook = Book("Under the tree","Chimamanda", 123344, 2010 )
    val bookresult = myBook.displayInfo()

    println(bookresult)

}

//var is changeable/ val is not/ so if i want to limit how you can access eg name, i'd use val name kule kwa properties
//since i've used var i can change the dog's name hapa i.e myDog. age = 2 but i can't do myDog.name = Red hapa in ln 8