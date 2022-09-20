package com.example.practicas_multimedia

fun main() {
    var numNotas =1
    var suma = 0
    while (numNotas<=10){
        println("Introduce nota:")
        var nota = readLine()!!.toInt()
        suma=suma+nota
        numNotas++
    }
    val promedio = suma/numNotas
    println("El promedio es $promedio")
}