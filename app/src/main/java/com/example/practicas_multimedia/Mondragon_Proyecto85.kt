package com.example.practicas_multimedia

fun main() {
    println("Escribe lado de cuadrado:")
    val lado = readLine()!!.toInt()
    println("La superficie del cuadrado es: ${superficie85(lado)}")
}

fun superficie85(lado:Int) = lado*lado