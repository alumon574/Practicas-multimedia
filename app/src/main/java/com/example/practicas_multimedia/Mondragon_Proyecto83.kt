package com.example.practicas_multimedia

fun main() {
    println("Escribe el lado de un cuadrado para ver su perimetro:")
    val lado = readLine()!!.toInt()
    println("El perimetro es igual a:")
    println(perimetro83(lado))
}

fun perimetro83(lado:Int):Int{
    return lado*4
}