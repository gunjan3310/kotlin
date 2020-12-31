package codeforces

import java.util.*

fun main(args:Array<String>){
    val n = readLine()!!.trim().toInt()
    var totalSolvable = 0

    val input = Scanner(System.`in`)

    var inputList = arrayListOf<Array<Int>>()
    for (x in 0..n-1){
        var count = 0
        for (y in 0..2){

            if (input.nextInt() == 1)count++
        }
        if (count>=2)totalSolvable++

    }

    println("$totalSolvable")
}