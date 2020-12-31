package codeforces

import java.util.*

fun main(args:Array<String>){
    val input= Scanner(System.`in`)

    val n = input.nextInt()
    val k = input.nextInt()
    var count = 0

    val scoreList = arrayListOf<Int>()
    var a=0
    while (a<n){
        scoreList.add(input.nextInt())
        a++
    }

    val kScore = scoreList[k-1]
    for (x in scoreList){

        if (x>0 && x>=kScore){
            count++
        }
    }

    println(count)
}