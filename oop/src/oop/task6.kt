package oop

open class Student(val firstName:String = "", val lastName:String = "", val group:String="", var averageMark:Double=0.0) {

    open fun getScholarship():Int{
         if (averageMark == 5.0){
            return 100
        }else{
            return 80
        }
    }
}

class Aspirant: Student() {

    override
    fun getScholarship():Int{
         if (averageMark == 5.0){
            return 200
        }else{
            return 180
        }
    }
}

fun main() {
    val student = Student("Ivan", "Petrenko", "2K14", 4.7)
    println(student.getScholarship())
    val aspirant = Aspirant()
    println(aspirant.getScholarship())

    val list = mutableListOf<Student>()
    list.add(aspirant)
    list.add(student)

    list[0].getScholarship()
    list[1].getScholarship()
}
