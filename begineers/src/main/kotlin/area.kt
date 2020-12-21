import java.util.*
val PI = 3.14159
fun main(){

    val input = Scanner(System.`in`)
    val inputData: String = input.nextLine()
    area(inputData)




}

fun area(input: String){
    val chararray = input.split(" ")
    val A: Double = chararray[0].toDouble()
    val B: Double = chararray[1].toDouble()
    val C: Double = chararray[2].toDouble()
    println(String.format("TRIANGULO: %.3f",(1/2.0)*A*C))
    println(String.format("CIRCULO: %.3f",PI*C*C))
    println(String.format("TRAPEZIO: %.3f",((A+B)/2)*C))
    println(String.format("QUADRADO: %.3f",B*B))
    println(String.format("RETANGULO: %.3f",A*B))

}