import java.util.*

fun main(args: Array<String>){
    val weightAry = arrayOf(2,3,4,1)
    val numAry = readLine()!!.trim().split(" ")
    val input = Scanner(System.`in`)
    val examScore = input.nextLine()



    var outputStr :String = ""

    var avg: Float = 0.0f

    for ((i,j) in numAry.withIndex()){
        avg += weightAry[i]*j.toFloat()
    }
    avg /= 10
    outputStr += String.format("Media: %.1f",avg)

    if (avg>=7.0f) outputStr += "\nAluno aprovado."
    else if (avg<5.0f) outputStr+="\nAluno reprovado."

    if (avg>5.0 && avg<6.9)outputStr+="\nAluno em exame."
    if (examScore.isNotEmpty()){
        outputStr+=String.format("\nNota do exame: %.1f",examScore.toFloat())
        avg = (avg+ examScore.toFloat())/2
        outputStr+=if (avg>=5.0)"\nAluno aprovado." else "Aluno reprovado."
        outputStr+=String.format("\nMedia final: %.1f",avg)
    }
    println(outputStr)

}