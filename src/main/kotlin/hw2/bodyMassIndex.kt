package hw2

fun bodyMassIndex(weight: Double, height: Double): String {
    val imt = weight/(height*height/10000)

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

    return "ИМТ: $imt\n$verdict"
}