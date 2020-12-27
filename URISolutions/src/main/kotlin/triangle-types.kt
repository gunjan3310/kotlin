fun main(args:Array<String>){
    var input = readLine()!!.trim().split(" ").toMutableList()

    for ((i,j) in input.withIndex())
        for ((k,l) in input.withIndex()){
            if (input[i].toFloat()<input[k].toFloat()){
                val temp = input[i]
                input[i]=input[k]
                input[k]=temp
            }
        }

    val A = input[2].toDouble()
    val B = input[1].toDouble()
    val C = input[0].toDouble()


    if(A<(B+C)){
        if(A*A == B*B + C*C) println("TRIANGULO RETANGULO")
        if(A*A > B*B + C*C) println("TRIANGULO OBTUSANGULO")
        if(A*A < B*B + C*C) println("TRIANGULO ACUTANGULO")
        if (A==B && B==C) println("TRIANGULO EQUILATERO")
        if (A==B || B==C || C==A) println("TRIANGULO ISOSCELES")
    }else if (A>=B+C) println("NAO FORMA TRIANGULO")
}