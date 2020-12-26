import java.util.*

fun main(args:Array<String>){
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    if (a%b == 0 || b%a == 0) println("Sao Multiplos")
    else println("Nao sao Multiplos")

}