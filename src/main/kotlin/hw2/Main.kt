package hw2

fun main(){

    println("Введите вес в кг:")
    val weight: Double = readLine()?.run { toDouble() } ?: 0.0
    println("Введите рост в см:")
    val height: Double = readLine()?.run { toDouble()} ?: 0.0
    bodyMassIndex(weight, height)

    /*
    bodyMassIndex(0.0, 0.0)
    bodyMassIndex(30.5, 158.0)
    bodyMassIndex(48.0, 158.0)
    bodyMassIndex(57.5, 158.0)
    bodyMassIndex(70.0, 158.0)
    bodyMassIndex(300.5, 158.0)
    bodyMassIndex(85.5, 158.0)
    bodyMassIndex(88.0, 158.0)
    */

}