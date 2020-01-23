package hw2

fun main(){

    println("Введите вес в кг:")
    val weight: Double = readLine()?.run { toDouble() } ?: 0.0
    println("Введите рост в см:")
    val height: Double = readLine()?.run { toDouble()} ?: 0.0
    val imt: Double = (bodyMassIndex(weight, height))
    println(getVerdict(imt))

    /*
    println(getVerdict(bodyMassIndex(0.0, 0.0)))
    println(getVerdict(bodyMassIndex(30.5, 158.0)))
    println(getVerdict(bodyMassIndex(48.0, 158.0)))
    println(getVerdict(bodyMassIndex(57.5, 158.0)))
    println(getVerdict(bodyMassIndex(70.0, 158.0)))
    println(getVerdict(bodyMassIndex(85.5, 158.0)))
    println(getVerdict(bodyMassIndex(88.0, 158.0)))
    println(getVerdict(bodyMassIndex(300.5, 158.0)))
    */
}

fun getVerdict(imt: Double): String {
    return when (imt){
        0.0 -> "Неверно введены данные"
        in 1.0..16.0 -> "Выраженный дефицит"
        in 16.01..18.5 -> "Дефицит"
        in 18.51..24.99 -> "Норма"
        in 25.0..30.0 -> "Предожирение"
        in 30.01..35.0 -> "Ожирение первой степени"
        in 35.01..40.0 -> "Ожирение второй степени"
        else -> "Ожирение третьей степени"
    }
}