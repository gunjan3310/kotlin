import java.util.*
import kotlin.math.abs

fun main(){
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    val c = input.nextInt()



    val mayorab = (a+b + abs(a-b))/2
    val mayorCM = (mayorab + c + abs(mayorab - c))/2

    println("$mayorCM eh o maior")
}