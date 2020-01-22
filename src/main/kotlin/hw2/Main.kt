package hw2

fun main(){

    println("Введите вес в кг:")
    val weight: Double = readLine()?.run { toDouble() } ?: 0.0
    println("Введите рост в см:")
    val height: Double = readLine()?.run { toDouble()} ?: 0.0
    println(bodyMassIndex(weight, height))



    /*
    println(bodyMassIndex(0.0, 0.0))
    println(bodyMassIndex(30.5, 158.0))
    println(bodyMassIndex(48.0, 158.0))
    println(bodyMassIndex(57.5, 158.0))
    println(bodyMassIndex(70.0, 158.0))
    println(bodyMassIndex(300.5, 158.0))
    println(bodyMassIndex(85.5, 158.0))
    println(bodyMassIndex(88.0, 158.0))
    */

}