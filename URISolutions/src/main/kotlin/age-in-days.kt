fun main(args: Array<String>){

    val inputDays = readLine()!!.trim().toInt()
    val year = inputDays/365
    val months = (inputDays - year*365)/30
    val day = inputDays - months*30 - 365*year
    println("$year ano(s) \n$months mes(es) \n$day dia(s)")

}