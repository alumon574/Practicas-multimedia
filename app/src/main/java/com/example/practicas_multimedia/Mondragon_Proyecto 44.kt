package com.example.practicas_multimedia

fun main() {
    var cantidadMenor = 0
    var cantidadEntre = 0
    var cantidadMayor = 0
    var cantidadPiezas = 0
    do {
        println("Escribe un peso en kilos:")
        var peso = readLine()!!.toDouble()
        if (peso<9.8)cantidadMenor++
        if (peso in 9.8..10.2)cantidadEntre++
        if (peso>10.2)cantidadMayor++
        cantidadPiezas++
    }while (peso!=0.0)
    println("Cantidad menor a 9.8 = $cantidadMenor")
    println("Cantidad entre 9.8 y 10.2 = $cantidadEntre")
    println("Cantidad Mayor a 10.2 = $cantidadMayor")
    println("Cantidad de piezas = $cantidadPiezas")
}