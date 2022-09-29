package com.example.practicas_multimedia

fun main() {
    println("Escribe la coordenada X")
    var X = readLine()!!.toInt()
    println("Escribe la coordenada Y")
    var Y = readLine()!!.toInt()

    when {
        X > 0 && Y > 0 -> println("Primer cuadrante")
        X < 0 && Y > 0 -> println("Segundo cuadrante")
        X < 0 && Y < 0 -> println("Tercer cuadrante")
        X > 0 && Y < 0 -> println("Cuarto cuadrante")
        else -> println("El punto se encuentra en uno de los ejes")
    }
}