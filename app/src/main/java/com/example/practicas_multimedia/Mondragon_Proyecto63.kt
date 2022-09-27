package com.example.practicas_multimedia

fun main() {
    println("Escribe un numero:")
    val numero = readLine()!!.toInt()
    when{
        numero<0 -> println("El numero es negativo")
        numero>0 -> println("El numero es positivo")
        else -> println("El numero es nulo")
    }
}