fun main(args:Array<String>){
    val input = readLine()!!.trim().toFloat()
    var adjustedSalary = 0.0
    var percent = 0

    when(input){
        in 0.0..400.0 -> {
            percent = 15
            adjustedSalary = input + (percent/100.0)*input
        }
        in 400.01..800.00 -> {
            percent = 12
            adjustedSalary = input + (percent/100.0)*input
        }

        in 800.01..1200.00 -> {
            percent = 10
            adjustedSalary = input + (percent/100.0)*input
        }

        in 1200.01..2000.00 -> {
            percent = 7
            adjustedSalary = input + (percent/100.0)*input
        }

        else -> {
            percent = 4
            adjustedSalary = input + (percent/100.0)*input
        }
    }

    var x = String.format("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d ",adjustedSalary,(adjustedSalary-input),percent)
    println(x+"%")
}