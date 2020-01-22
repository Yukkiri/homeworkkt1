package hw1

fun main(){

    println("Введите сумму текущей продажи:")
    val amount: Int = readLine()?.toInt() ?: 0
    println("Введите сумму предыдущих продаж:")
    val total: Int = readLine()?.toInt() ?: 0
    println("Введите 1, если вы эксклюзивный автор:")
    val exclusive: Int = readLine()?.toInt() ?: 0
    println(calculateFee(amount, total, exclusive))

    //Если лень вводить вручную
    /*
    println(calculateFee(30, 100, 1))
    println(calculateFee(30, 100, 0))
    println(calculateFee(500, 1500, 1))
    println(calculateFee(500, 1500, 3423))
    println(calculateFee(300, 15000, 1))
    println(calculateFee(300, 15000, 15))
    println(calculateFee(400, 100000, 1))
    println(calculateFee(400, 100000, 0))
    */

}

/*
Если предыдущая сумма продаж от 0 до 1 000, то % составляет 30% от суммы
Если предыдущая сумма продаж от 1 001 до 10 000, то % составляет 25% от суммы
Если предыдущая сумма продаж от 10 001 до 50 000, то % составляет 20% от суммы
Если предыдущая сумма продаж от 50 001, то % составляет 15% от суммы
 */