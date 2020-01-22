package hw3

fun main(){
    println("Введите время в секундах")
    val time: Int = readLine()?.toInt() ?: 0

    timeConverter(time)
        
    /*
    timeConverter(0)
    timeConverter(55)
    timeConverter(837)
    timeConverter(3453)
    timeConverter(23492)
    timeConverter(743892)
    timeConverter(4536534)
    timeConverter(47837392)
    timeConverter(534658934)
    */
}