fun main(args:Array<String>){
    val time = readLine()!!.trim().split(" ")
    val a = time[0].toInt()
    val aMinute = time[1].toInt()
    val b = time[2].toInt()
    val bMinute = time[3].toInt()
    var minutes:Int = 0
    var hours: Int = 0
    var y = 0
    var x = 0

    x = a*60 + aMinute
    y = b*60 + bMinute

    var duration = y-x

    if(duration>0){
        hours = duration/60
        minutes = duration % 60
    }else if(duration<0){
        //println("$duration is duration between $y and $x")
        duration = (1440 + duration)

        hours = duration/60
        minutes = duration%60

    }else{
        hours = 24
        minutes = 0
    }

    println(String.format("O JOGO DUROU $hours HORA(S) E $minutes MINUTO(S)"))

}