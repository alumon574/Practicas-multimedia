package com.example.practicas_multimedia

fun main() {
    println("numero de personas")
    val numPersonas = readLine()!!.toInt()
    var contador = 1
    var sumaAltura = 0.0
    while (contador<=numPersonas){
        println("introduce altura")
        var altura = readLine()!!.toFloat()
        sumaAltura = sumaAltura + altura
        contador++
    }
    val media = sumaAltura/numPersonas
    println("La altura media de las $numPersonas es de $media")
}