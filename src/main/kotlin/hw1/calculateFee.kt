package hw1

fun calculateFee(amount: Int, total: Int, exclusive: Int): Int {
    val firstFee: Double = 0.3
    val secondFee: Double = 0.25
    val thirdFee: Double = 0.2
    val fourthFee: Double = 0.15
    val exclusiveDiscount: Double = 0.05

    var fee: Double = when(total){
        in 0..1000 -> firstFee
        in 1001..10000 -> secondFee
        in 10001..50000 -> thirdFee
        else -> fourthFee
    }

    if(exclusive == 1){
        fee -= exclusiveDiscount
    }

    return (amount*fee).toInt()
}