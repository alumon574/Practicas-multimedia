package com.example.practicas_multimedia

fun main() {
    println("Introduce cuanto mide el lado de un cuadrado:")
    val lado = readLine()!!.toInt()
    val perimetro = lado*4
    println("El perimetro de un cuadrado de lado $lado es $perimetro")
}