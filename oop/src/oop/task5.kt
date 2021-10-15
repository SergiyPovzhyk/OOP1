package oop

class Numbers(var a:Int, var b:Int){
    var mark : Boolean = true
    fun outputNum(){
        if (a <= b && mark){
            println(a)
            a++
            if (a == b){
                println(a)
                mark = false
            }
            outputNum()
        }else if (a >= b  && mark){
            println(a)
            a--
            if (a == b){
                println(a)
                mark = false
            }
            outputNum()
        }
    }
}

fun main() {
    val numbers = Numbers(24, 43)
    numbers.outputNum()
}