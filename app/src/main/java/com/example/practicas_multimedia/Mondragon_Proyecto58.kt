package com.example.practicas_multimedia

fun main() {
    var negativos = 0
    var positivos = 0
    var multi15 = 0
    var pares = 0
    for (i in 1..10){
        println("Escribe numero:")
        var numero = readLine()!!.toInt()
        if (numero>0)positivos++
        if (numero<0)negativos++
        if (numero%15==0)multi15++
        if (numero%2==0)pares++
    }
    println("Cantidades:\n" +
            "Positivos = $positivos\n" +
            "negativos = $negativos\n" +
            "Multiplos de 15 = $multi15\n" +
            "Pares = $pares")
}