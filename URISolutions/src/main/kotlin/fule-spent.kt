import java.util.*

fun main(){
    val MILAGE: Float = 12.0f //in km/l
    val input = Scanner(System.`in`)
    val distance = readLine()!!.trim().toInt()
    val avgSpeed = readLine()!!.trim().toInt()

    println(String.format("%.3f",(distance*avgSpeed/MILAGE)))

}