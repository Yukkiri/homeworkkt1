package hw3

fun timeConverter(){
    println("Введите время в секундах")

    val timeString: String = when(val time: Int = readLine()?.toInt() ?: 0){
        0 -> "Только что"
        in 1..59 -> "Менее минуты назад"
        in 60..3600 -> min(time)
        in 3601..86400 -> hour(time)
        in 86401..31535999 -> day(time)
        31536000 -> "Год назад"
        else -> "Более года назад"
    }

    println(timeString)
}

fun min(time: Int): String{
    val minute: Int = time/60
    val timeStr: String = minute.toString()
    return if (minute == 11 || minute == 12 || minute == 13 || minute == 14){
        "$timeStr минут"
    } else {
        val last: Char = timeStr[timeStr.length-1]
        "$minute " + when(last){
            '1' -> "минуту"
            '2', '3', '4' -> "минуты"
            else -> "минут"
        }
    }
}

fun hour(time: Int): String{
    val hours: Int = time/3600
    val timeStr: String = hours.toString()
    return if (hours == 11 || hours == 12 || hours == 13 || hours == 14){
        "$timeStr часов"
    } else {
        val last: Char = timeStr[timeStr.length-1]
        "$hours " + when(last){
            '1' -> "час"
            '2', '3', '4' -> "часа"
            else -> "часов"
        }
    }
}

fun day(time: Int): String{
    val days: Int = time/86400
    val addDay: Int
    var timeStr: String = days.toString()
    if (timeStr.length >= 2){
        timeStr = timeStr.substring(1)
        addDay = timeStr.toInt()
    } else {
        addDay = days
    }
    return if (addDay == 11 || addDay == 12 || addDay == 13 || addDay == 14){
        "$days дней"
    } else {
        val last: Char = timeStr[timeStr.length-1]
        "$days " + when(last){
            '1' -> "день"
            '2', '3', '4' -> "дня"
            else -> "дней"
        }
    }
}
