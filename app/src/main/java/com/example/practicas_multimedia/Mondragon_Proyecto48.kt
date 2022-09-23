package com.example.practicas_multimedia

fun main() {
    var suma = 0
    for (i in 1..10){
        println("Escribe un numero:")
        val numero = readLine()!!.toInt()
        suma+=numero
    }
    println("La suma da $suma")
    val media = suma/10
    println("La media es $media")
}