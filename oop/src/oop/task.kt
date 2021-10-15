package oop

class Phone {

    var number: String
    val model: String
    val weight: Int

    fun receiveCall(nameCall:String){
        println("Звонит $nameCall")
    }
//    fun getNumber():String?{
//        return number
//    }

    fun receiveCall(nameCall: String, incomeNum : String){
        println("Звонит $nameCall, номер - $incomeNum")
    }

    constructor() {
        this.number = ""
        this.model = ""
        this.weight = 0
    }


    constructor(number: String, model: String) {
        this.number = number
        this.model = model
        this.weight = 0
    }

    constructor(number: String, model: String, weight: Int) {
        this.number = number
        this.model = model
        this.weight = weight
    }



}


fun main(){
    var ph1 = Phone("0992231222", "Samsung", 233)
    var ph2 = Phone("09393933304", "LG", 199)
    var ph3 = Phone("0673319864", "Xiaomi", 212)

    ph1.receiveCall("Alex")
    ph2.receiveCall("Oleg")
    ph3.receiveCall("Mikhail")

    ph2.receiveCall("Anna", "0472331133")





}