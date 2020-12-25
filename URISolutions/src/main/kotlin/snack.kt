fun main(args: Array<String>){
    val items = floatArrayOf(4.0f,4.50f,5.0f,2.0f,1.50f)

    val item = readLine()!!.trim().split(" ")
    println(String.format("Total: R$ %.2f",items[item[0].toInt()-1]*item[1].toFloat()))
}