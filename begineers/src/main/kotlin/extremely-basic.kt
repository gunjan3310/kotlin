fun main(){
    //this is question 1's solution
    //extremely_basic()
    area_of_circle()
}

fun extremely_basic(){
    val a: Int = readLine()!!.toInt()
    val b: Int = readLine()!!.toInt()

    var x: Int = a + b
    println(x)
}

fun area_of_circle(){
    val PI: Double = 3.14159
    var r: Double = readLine()!!.toDouble()
    val A: Double = PI*r*r
    println(String.format("A=%.4f",A))
}