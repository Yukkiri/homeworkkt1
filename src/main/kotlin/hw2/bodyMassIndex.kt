package hw2

fun bodyMassIndex(){
    println("Введите вес в кг:")
    val weight: Double = readLine()?.run { toDouble() } ?: 0.0
    println("Введите рост в см:")
    val height: Double = readLine()?.run { toDouble()/100 } ?: 0.0

    val imt = weight/(height*height)

    var verdict: String = when (imt){
        0.0 -> "Неверно введены данные"
        in 1.0..16.0 -> "Выраженный дефицит"
        in 16.01..18.5 -> "Дефицит"
        in 18.51..24.99 -> "Норма"
        in 25.0..30.0 -> "Предожирение"
        in 30.01..35.0 -> "Ожирение первой степени"
        in 35.01..40.0 -> "Ожирение второй степени"
        else -> "Ожирение третьей степени"
    }

    println("ИМТ: $imt")
    println(verdict)
}