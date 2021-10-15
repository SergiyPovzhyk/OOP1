package oop

class Person{
    val fullName : String
    var age : Byte

    fun move(){
        println("$fullName двигается")
    }
    fun talk(){
        println("$fullName говорит")
    }

    constructor(){
        this.fullName = ""
        this.age = 0
    }
    constructor(fullName:String,age : Byte){
        this.fullName = fullName
        this.age = age
    }
}
fun main(){
    val pers1 = Person()
    val pers2 = Person("Phil Kessel", 32)

    pers1.move()
    pers2.talk()
}