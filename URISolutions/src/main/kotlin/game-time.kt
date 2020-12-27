fun main(args:Array<String>){
    val time = readLine()!!.trim().split(" ")
    val a = time[0].toInt()
    val b = time[1].toInt()
    var x = b - a
    if(x<0)x = 24+x
    else if (a==b)x=24

    println("O JOGO DUROU $x HORA(S)")
}