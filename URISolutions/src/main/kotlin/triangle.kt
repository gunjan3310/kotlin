fun main(args:Array<String>){
    val coordinates = readLine()!!.trim().split(" ")
    val a = coordinates[0].toFloat()
    val b = coordinates[1].toFloat()
    val c = coordinates[2].toFloat()
    if (a > 0.0 && b > 0.0 && c > 0.0){
        if ((a+b)>c && (b+c)>a && (c+a)>b){
            println(String.format("Perimetro = %.1f",a+b+c))
        }
        else{
            println(String.format("Area = %.1f",((a+b)/2)*c))
        }
    }
}