package codeforces

fun main(args:Array<String>){
    val weight = readLine()!!.trim().toInt()
    if (weight%2 == 0 && weight >=4) println("YES")
    else println("NO")
}