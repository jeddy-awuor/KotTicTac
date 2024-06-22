data class Books(
    var title: String,
    var author: String,
    var isbn: Int,
    var publicationYear: Int
)
fun main() {
    val myBook = Books("xyz", "chimaman", 1993, 1990)
    val result = BookInfo(myBook)

    println(result)


}

fun BookInfo(book: Books):String{
    return "title:${book.title}, author:${book.author}, isbn:${book.isbn}, publication year:${book.publicationYear}"
}