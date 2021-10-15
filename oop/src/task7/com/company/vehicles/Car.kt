package task7.com.company.vehicles

import task7.com.company.details.Engine
import task7.com.company.professions.Driver

open class Car(val brand:String, val classCar:String, val weight:Double, val driver: Driver, val motor:Engine):Driver("Alex", 4) {

    fun start(){
        println("Поехали")
    }

    fun stop(){
        println("Останавливаемся")
    }

    fun turnRight(){
        println("Поворот направо")
    }

    fun turnLeft(){
        println("Поворот налево")
    }

    fun toString1(){
        println("-------------")
        println("Info:")
        println("1) $brand")
        println("2) $classCar")
        println("3) $weight")
        println("4) ${driver.experience}")
        println("5) ${driver.fullName}")
        println("6) ${motor.power}")
        println("7) ${motor.manufacturer}")
        println("-------------")
    }

}