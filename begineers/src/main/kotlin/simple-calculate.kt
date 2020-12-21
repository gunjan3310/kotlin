import java.util.*

fun main(){
    var input = Scanner(System.`in`)
    val productA: String = input.nextLine()
    val productB: String = input.nextLine()
    val a = calculate(productA)
    val b = calculate(productB)
    println(String.format("VALOR A PAGAR: R$ %.2f",a + b))
}

fun calculate(product: String): Double{
    val array = product.split(" ")
    //val a: Int = array[0].toInt()
    val b: Int = array[1].toInt()
    val c: Double = array[2].toDouble()
    return b*c

}

