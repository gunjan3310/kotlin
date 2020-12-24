import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>){
    val input = Scanner(System.`in`)
    val A = input.nextFloat()
    val B = input.nextFloat()
    val C = input.nextFloat()

    val D = B*B - 4*A*C
    if (D<0.0f || A == 0.0f) {
        println("Impossivel calcular")
        return
    }


    println(String.format("R1 = %.5f\nR2 = %.5f",((-B + sqrt(D))/(2*A)),((-B - sqrt(D))/(2*A))))

}