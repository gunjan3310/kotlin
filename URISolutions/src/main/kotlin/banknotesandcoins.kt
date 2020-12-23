import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.round

val banknote = arrayOf<Float>(100.0f,50.0f,20.0f,10.0f,5.0f,2.0f)
val bankcoins = arrayOf<Float>(1.0f,0.5f,0.25f,0.1f,0.05f,0.01f)
fun main(args: Array<String>){

    val inputValue = readLine()!!.trim().toFloat()

    NotesTally(inputValue)

}

fun NotesTally(value:Float){
    var solution : MutableList<Int> = mutableListOf()
    println("NOTAS:")
    var index = 0
    var dividend = value

    for (i in 0..banknote.size-1){
        solution.add(i,(dividend/banknote[i]).toInt())
        dividend = dividend%banknote[i]

    }

    for(i in 0..banknote.size-1){
        println(String.format("%d nota(s) de R$ %.2f",solution[i],banknote[i]))
    }

    var solution2: MutableList<Int>  = mutableListOf()
    println("MOEDAS:")
    val df = DecimalFormat("#.###")
    df.roundingMode = RoundingMode.CEILING
    for (i in 0..bankcoins.size-1){

        solution2.add(i,(dividend/bankcoins[i]).toInt())
        dividend = df.format(dividend%bankcoins[i]).toFloat()
        //println("$i is i and $dividend is dividend now")
    }

    for(i in 0..bankcoins.size-1){
        println(String.format("%d moeda(s) de R$ %.2f", solution2[i],bankcoins[i]))
    }

}