package oop

abstract class Animal(var food:String, var location:String) {

    abstract fun makeNoise()

    abstract fun eat()

    abstract fun sleep()
}

class Cat(food: String, location:String, val meow:String) :Animal(food, location) {
    override fun makeNoise() {
        println("MEOW")
    }

    override fun eat() {
        println("Кот ест")
    }

    override fun sleep() {
        println("Кот спит")
    }
}

class Dog(food: String, location:String, val bark:String) :Animal(food, location) {
    override fun makeNoise() {
        println("WOOF")
    }

    override fun eat() {
        println("Собака ест")
    }

    override fun sleep() {
        println("Собака спит")
    }
}

class Horse(food: String, location:String, val laughs :String) :Animal(food, location) {
    override fun makeNoise() {
        println("IGOGO")
    }

    override fun eat() {
        println("Конь ест")
    }

    override fun sleep() {
        println("Конь спит")
    }
}

class Veterinar {
    fun treatAnimal(animal: Animal) {
        println(animal.food + " , " + animal.location)
    }
}

fun main() {
    val cat = Cat("mouse", "home", "MEOW!")
    val dog = Dog("meat", "booth", "WOOF!!!")
    val horse = Horse("hay", "barn", "Igogo")

    val veterinar = Veterinar()

    veterinar.treatAnimal(cat)
    veterinar.treatAnimal(dog)
    veterinar.treatAnimal(horse)

    var arr: Array<Animal> = arrayOf(cat, dog, horse)

    for (i in 0..arr.size-1){
        veterinar.treatAnimal(arr[i])
    }
}