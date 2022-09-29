package com.example.practicas_multimedia

fun main() {
    var sumaMayores = 0
    for (i in 1..5){
        println("Escribe primer numero (Ciclo numero $i):")
        var n1 = readLine()!!.toInt()
        println("Escribe segundo numero (Ciclo numero $i):")
        var n2 = readLine()!!.toInt()
        println("Escribe tercer numero (Ciclo numero $i):")
        var n3 = readLine()!!.toInt()
        println("Numeros intoducidos:\n" +
                "$n1,$n2,$n3")
        when{
            n1>n2 && n1>n3 -> sumaMayores+= n1
            n2>n1 && n2>n3 ->sumaMayores+=n2
            n3>n1 && n3>n2 -> sumaMayores+=n3
        }
    }
    println("Suma del mayor de cada ciclo = $sumaMayores")
}