package com.example.practicas_multimedia

fun main() {
    var mayor12 = 0
    println("¿Cuantos triangulos?")
    val cantidadTriangulos = readLine()!!.toInt()
    for (i in 1..cantidadTriangulos){
        println("Escribe la base:")
        var base = readLine()!!.toInt()
        println("Escribe la altura:")
        var altura = readLine()!!.toInt()
        var superficie = base*altura/2
        println("La base mide $base")
        println("La altura es $altura")
        println("La superficie es $superficie")
        if (superficie>12)
            mayor12++
    }
    println("Hay $mayor12 triangulos de superficie mayor a 12")
}