fun main(args: Array<String>){
    val value = readLine()!!.trim().toFloat()

    when(value){
        in 0.0f..25.0f -> println("Intervalo [0,25]")
        in 25.00001..50.0000000 -> println("Intervalo (25,50]")
        in 50.00001..75.0000000 -> println("Intervalo (50,75]")
        in 75.00001..100.0000000 -> println("Intervalo (75,100]")
        else -> println("Fora de intervalo")
    }
}