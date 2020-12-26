fun main(args:Array<String>){

    val ar1 = readLine()!!.trim().split(" ")
    val ar = ar1.toMutableList()
    for (a in 0..ar.size-1)
        for(b in 0..ar.size-1){
            if(ar[a].toInt()<ar[b].toInt()){
                var temp = ar[a]
                ar[a]=ar[b]
                ar[b]=temp
            }
        }

    ar.forEach{item->
        println(item)
    }
println()
    ar1.forEach { item->
        println(item)
    }
}