package com.example.practicas_multimedia

fun main() {
    var suma = 0
    for (i in 1..10){
        println("Escribe numero (se sumaran a a partir del quinto numero)")
        println("numero actual $i")
        var numero = readLine()!!.toInt()
        if (i>5)
            suma+=numero
    }
    println("Suma de los 5 ultimos nums = $suma")
}