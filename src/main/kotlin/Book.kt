class Book(var title:String, var author:String, var isbn:Int, var yearPublication:Int) {
    fun displayInfo():String{
        return "title:${title}, author:${author}, isbn:${isbn}, publication year:${yearPublication}"
    }
}