package hw3

fun main(){
    println("Введите время в секундах")
    val time: Int = readLine()?.toInt() ?: 0

    var period: String = timeConverter(time)

    println(period)

    /*
    println(timeConverter(0))
    println(timeConverter(55))
    println(timeConverter(837))
    println(timeConverter(3453))
    println(timeConverter(23492))
    println(timeConverter(743892))
    println(timeConverter(4536534))
    println(timeConverter(47837392))
    println(timeConverter(534658934))
    */
}