package codeforces

fun main(args:Array<String>){
    val n = readLine()!!.trim().toInt()

    var words = mutableListOf<String>()
    for (x in 0..n-1){
       words.add(x, readLine()!!.trim())
    }

    for (x in words){
        if (x.length<=10){
            println(x)
            continue
        }
        //val y = x.toCharArray()
        var count = x.length-2
        println(x[0]+count.toString()+x[x.length -1])
    }
}