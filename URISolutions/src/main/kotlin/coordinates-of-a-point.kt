class CartesianPoint(points: String) {
    val x:Float
    val y:Float
    init {
        val pointsxy = points.trim().split(" ")
        x = pointsxy[0].toFloat()
        y = pointsxy[1].toFloat()
    }


}

fun main(args: Array<String>){
    val p1 : CartesianPoint = CartesianPoint(readLine()!!)
    println(locatePoint(p1))

}

fun locatePoint(p1:CartesianPoint):String{
    var s : String =""
    if (p1.x >0.0f && p1.y >0.0f)s="Q1"
    else if (p1.x<0.0f && p1.y >0.0f)s="Q2"
    else if(p1.x<0.0f && p1.y<0.0f)s="Q3"
    else if (p1.x>0.0f && p1.y <0.0f)s="Q4"
    else if(p1.x==0.0f && p1.y==0.0f)s="Origem"
    else if(p1.x == 0.0f && p1.y !=0.0f)s="Eixo X"
    else if(p1.x!=0.0f && p1.y == 0.0f)s="Eixo Y"
    return s.toString()
}
