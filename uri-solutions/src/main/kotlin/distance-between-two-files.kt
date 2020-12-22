import java.util.*
import kotlin.math.round
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val p1 = Point(input.nextLine())
    val p2 = Point(input.nextLine())

    var solution = sqrt(((p1.x-p2.x)*(p1.x-p2.x))+((p1.y-p2.y)*(p1.y-p2.y)))
    solution = solution * 10000
    round(solution)
    solution = solution /10000
    println(String.format("%.4f",solution))
}
class Point(P: String){
    val x:Float
    val y:Float

    init {
        val array = P.split(" ")
        x = array[0].toFloat()
        y = array[1].toFloat()

    }

}