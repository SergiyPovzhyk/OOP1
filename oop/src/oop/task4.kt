package oop

class Reader(var fullName:String, number:Int, faculty:String, birthDay:String, phoneNumber:String) {

    var sumOfBook = mutableListOf<String>()
    var returnedBooks:Int = 0

    fun takeBook(){
        println("$fullName взял ${sumOfBook.size} книг(и)")
    }

    fun takeBook(books:String){
        sumOfBook.add(books.toString())
        println("$fullName взял книги: ${sumOfBook.joinToString()}")
    }

    fun returnBook(){
        println("$fullName вернул $returnedBooks книг(и)")
    }

    fun returnBook(nameOfBook:String){
            sumOfBook.remove(nameOfBook)
            println("$fullName вернул книгу $nameOfBook ")
            returnedBooks++

    }
}

fun main() {
    val reader = Reader("Steven Stamkos", 123, "FRIIT", "26.03.1999", "+380675585555" )

    reader.takeBook()
    reader.takeBook("Cinderella")
    reader.takeBook("Огнем и мечем")
    reader.takeBook("Спартак")
    reader.takeBook()
     reader.returnBook("Спартак")
    reader.returnBook()

}