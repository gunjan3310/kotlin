fun main(args: Array<String>){
    val seconds = readLine()!!.trim().toInt()

    val hours = seconds/3600
    var remSeconds = seconds-hours*3600
    val minutes = remSeconds/60
    remSeconds = remSeconds - minutes*60
    val second = remSeconds
    println("$hours:$minutes:$second")
}