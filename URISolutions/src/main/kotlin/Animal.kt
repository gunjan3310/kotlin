fun main(args:Array<String>){

    val input = readLine()!!.trim()
    val input2 = readLine()!!.trim()
    val input3 = readLine()!!.trim()

    if (input=="vertebrado"){
        if (input2 == "ave"){
            if(input3 == "carnivoro")
                print("aguia")
            else{
                println("pomba")
            }
        }else{
            if (input3 == "onivoro"){
                println("homem")
            }else{
                println("vaca")
            }
        }
    }else{
        if (input2 == "inseto"){
            if (input3=="hematofago"){
                println("pulga")
            }else{
                println("lagarta")
            }
        }else{
            if (input3 == "hematofago"){
                println("sanguessuga")
            }else{
                println("minhoca")
            }

        }

    }




}
