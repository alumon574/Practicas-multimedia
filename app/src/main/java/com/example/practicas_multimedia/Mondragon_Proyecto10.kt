package com.example.practicas_multimedia

fun main() {
    val sueldo = readLine()!!.toFloat()
    if (sueldo>3000)
        println("A pagar a hacienda")
    else println("No pagas impuestos")
}