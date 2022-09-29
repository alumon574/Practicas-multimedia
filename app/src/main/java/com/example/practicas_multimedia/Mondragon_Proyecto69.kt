package com.example.practicas_multimedia

fun main() {
    var contador0 = 0
    var contador1 = 0
    var contador2 = 0
    var contadorMas = 0

    for (i in 1..10) {
        println("Escribe el numero de hijos (Familia numero $i)")
        var hijos = readLine()!!.toInt()
        if (hijos>=0){
        when (hijos) {
            0 -> contador0++
            1 -> contador1++
            2 -> contador2++
            else -> contadorMas++
        }
        }
    }
    println("Hay $contador0 familias con 0 hijos")
    println("Hay $contador1 familias con 1 hijo")
    println("Hay $contador2 familias con 2 hijos")
    println("Hay $contadorMas familias con mas de 2 hijos")
}