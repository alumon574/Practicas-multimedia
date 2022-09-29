package com.example.practicas_multimedia

fun main() {
    var sector1 = 0
    var sector2 = 0
    var sector3 = 0
    var sector4 = 0
    println("Escribe cuantos puntos vas a introducir")
    val numPuntos = readLine()!!.toInt()
    for (i in 1..numPuntos) {
        println("Escribe la coordenada X")
        var X = readLine()!!.toInt()
        println("Escribe la coordenada Y")
        var Y = readLine()!!.toInt()

        println("Punto $i = $X,$Y")
        if (X > 0 && Y > 0) sector1++
        else if (X < 0 && Y > 0) sector2++
        else if (X < 0 && Y < 0) sector3++
        else if (X > 0 && Y < 0) sector4++

    }
    println("Primer sector = $sector1 puntos")
    println("Segundo sector = $sector2 puntos")
    println("Tercer sector = $sector3 puntos")
    println("Cuarto sector = $sector4 puntos")
}