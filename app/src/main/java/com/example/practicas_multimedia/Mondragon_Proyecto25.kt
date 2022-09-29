package com.example.practicas_multimedia

fun main() {
    println("Introduce un dia del mes")
    val dia = readLine()!!.toInt()
    println("mes")
    val mes = readLine()!!.toInt()

    if (dia==25&&mes==12)
        println("Es navidad")
    else println("No es navidad")
}