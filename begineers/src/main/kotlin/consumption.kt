import java.util.*
import kotlin.math.round
fun main()
{
    val input = Scanner(System.`in`)
    val distance = input.nextDouble()
    val consumption = input.nextDouble()

    val calculation = round( distance/consumption * 1000)
    println("${calculation/1000} km/l")


}