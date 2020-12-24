import java.util.*

fun main(args: Array<String>){
    val input = Scanner(System.`in`)

    val A = input.nextInt()
    val B = input.nextInt()
    val C = input.nextInt()
    val D = input.nextInt()

    if (B>C && D>C && (C+D)>(A+B)){
        if(C>0&&D>0 && (A%2)==0) println("Valores aceitos")
    }else println("Valores nao aceitos")
}