fun main() {
    val mylist = listOf("Car,house,shoes") //is immutable ie no add
    println(mylist)

    val mylist2 = mutableListOf("Husband", "kids" , "babies")
    println(mylist2)

    mylist2.add("Private jet") //adds at end of list
    println(mylist2)
    mylist2.add(2,"Firefox") //adds at specific index

    mylist2.remove("Husband")
    println(mylist2)
    mylist2.removeAt(1)
    println(mylist2)

    println(mylist2[0]) //specific index printing

    mylist2[0] = "watoto" //change index specifically
    println(mylist2)
    mylist2.set(0,"mpointy")//changes but both are fines
    println(mylist2)

    mylist2.contains("mpointy") //checks if the list contains the string and gives a boolean value (true or false)
    if (mylist2.contains("mpointy")){
        println("Your list has mpointy")
    }else{
        println("It does not have mpointy")
    }
    /* var mycheck = mylist2.contains("mpointy") //returns a boolean value in our case itarudisha true to the var
    if(mycheck)...else.... // inakuwa if(true)...else...
     */

    for(items in mylist2){
        if (items == "Private jet"){
            mylist2.add("Jehova's blessings")
            break
                   }
        println(items)
    }

    var vanity = mutableListOf("Car", "House", "Private jet", "Yacht")
    val result = vanity.contains("Juju")

   for(item in vanity){ //gives you the actual item
       println(item)
       if(item == "Private jet"){
           break
       }
   }

    for(index in 0..<vanity.size){ //getting index
        println("The item number $index is a ${vanity[index]}")
    }

    for ((index,item) in vanity.withIndex()){  //.withIndex gets the index and item name and stores it in the values index and item
        println("The item number $index is a $item")
    }



    



}