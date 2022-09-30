package com.example.practicas_multimedia

fun verSuperficie79(lado:Int):Int{
    return lado*lado
}

fun main() {
    println("Escribe el lado de un cuadrado")
    val lado = readLine()!!.toInt()
    val sup = verSuperficie79(lado)
    println("Superficie = $sup")
}