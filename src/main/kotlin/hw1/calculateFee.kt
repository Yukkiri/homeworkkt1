package hw1

fun calculateFee(){
    val firstFee: Double = 0.3
    val secondFee: Double = 0.25
    val thirdFee: Double = 0.2
    val fourthFee: Double = 0.15
    val exclusiveDiscount: Double = 0.05

    println("Введите сумму текущей продажи:")
    val amount: Int = readLine()?.toInt() ?: 0
    println("Введите сумму предыдущих продаж:")
    val total: Int = readLine()?.toInt() ?: 0
    println("Введите 1, если вы эксклюзивный автор:")
    val exclusive: Int = readLine()?.toInt() ?: 0

    var fee: Double = when(total){
        in 0..1000 -> firstFee
        in 1001..10000 -> secondFee
        in 10001..50000 -> thirdFee
        else -> fourthFee
    }

    if(exclusive == 1){
        fee -= exclusiveDiscount
    }

    val totalFee: Double = amount*fee
    val sum: Int = amount+total

    println("Общая сумма продаж: $sum")
    println("Текущая плата: $fee")
    println("К оплате: $totalFee")

}