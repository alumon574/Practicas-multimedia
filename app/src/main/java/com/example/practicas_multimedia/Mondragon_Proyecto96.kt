package com.example.practicas_multimedia

fun main() {
multiplo2y5()
}

fun multiplo2y5() {
    fun mutliplo(n1: Int, divisor: Int) = n1 % divisor == 0
    var mult2 = 0
    var mult5 = 0
    for (i in 1..10){
        println("Escribe un valor:")
        val valor = readLine()!!.toInt()
        if (mutliplo(valor,2))
            mult2++
        if (mutliplo(valor,5))
            mult5++
    }
    println("Multiplos de 2 = $mult2\nMultiplos de 5 = $mult5")
}
