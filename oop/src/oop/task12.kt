package oop

class Product(var name:String, var price:Double, var rating:String) {
}

class Category(var name:String, var products:Array<String>) {
}

class Basket {
    var buyProducts = arrayOf("hockey stick", "racket", "shuttlecock", "basketball hoop")
}

class User {
    val login = "qwerty"
    val password = "0987654321"
    val basket = Basket()
}


fun main() {
    val arrayProducts:Array<String> = arrayOf("#1", "#2")

    val category1 = Category("Puck", arrayProducts)
    val category2 = Category("Ball", arrayProducts)

    val user = User()
}