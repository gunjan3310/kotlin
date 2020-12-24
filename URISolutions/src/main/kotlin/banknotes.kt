val banknotes = arrayOf<Int>(100,50,20,10,5,2,1)
fun main(args: Array<String>){

    var solution = arrayOf<Int>(0,0,0,0,0,0,0)
    val amount = readLine()!!.trim().toInt()
    println(amount)
    var index = 0
    var dividend = amount
    while (dividend!=0){
        solution[index] = dividend/banknotes[index]
        dividend = dividend%banknotes[index]
        index++

    }
    printSolution(solution)
}

fun printSolution(solution: Array<Int>){
  for(i in 0..6){
      println("${solution[i]} nota(s) de R$ ${banknotes[i]},00")
  }
}