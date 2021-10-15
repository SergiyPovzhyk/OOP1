package oop

class Matrix(var columns:Int, var rows:Int) {

    var array = Array<Array<Int>>(rows){
            i ->
        Array<Int>(columns){
                j -> j
        }
    }

    fun add(matrix:Array<Array<Int>>):Array<Array<Int>>{

        for (i in 0..columns - 1){
            for (j in 0..rows - 1){
                matrix[i][j] += array[i][j]
            }
        }
        return matrix
    }

    fun multip(num:Int):Array<Array<Int>>{
        for (i in 0..columns - 1){
            for (j in 0..rows - 1){
                array[i][j] *= num
            }
        }
        return array
    }

    fun printing() {
        for (i in array) {
            for (j in i) {
                print(j)
            }
            println()
        }

    }


}

fun main() {
    val matrix = Matrix(6, 6)

    var array1 = Array<Array<Int>>(6){
            i ->
        Array<Int>(6){
                j -> j
        }
    }

    for (i in array1){
        for (j in i){
            print(j)
        }
        println()
    }




}