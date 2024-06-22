class Car (var brand : String, var model: String, var year: Int){  //defauly details
    init {

    }
    fun detail(): String{
        return "brand: ${brand}, model:${model}, year:${year}"
    }

}