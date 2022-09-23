package com.example.practicas_multimedia

fun main() {
    var mayor7 = 0
    var menor7 = 0
    for (i in 1..10){
        println("Escribe nota:")
        var nota = readLine()!!.toInt()
        if (nota>=7)
            mayor7++
        if (nota<7)
            menor7++
    }
    println("Hay $mayor7 notas mayor o iguales a 7")
    println("Hay $menor7 notas menores a 7")
}