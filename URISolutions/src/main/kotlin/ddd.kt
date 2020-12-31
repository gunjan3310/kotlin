fun main(args:Array<String>){
    val inputCode = readLine()!!.trim().toInt()
    var x = ""
    when(inputCode){

        61 -> x = "Brasilia"
        71 -> x= "Salvador"
        11 -> x = "Sao paulo"
        21 -> x= "Rio de Janeiro"
        32 -> x = "Juiz de Fora"
        19 -> x = "Campinas"
        27 -> x= "Vitoria"
        31 -> x= "Belo Horizonte"
        else ->x =  "DDD nao cadastrado"
    }

    println(x)


}