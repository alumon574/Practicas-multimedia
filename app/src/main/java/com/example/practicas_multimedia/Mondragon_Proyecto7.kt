package com.example.practicas_multimedia

fun main() {
    println("Precio:")
    val precio = readLine()!!.toFloat()
    println("Cantidad:")
    val cantidad = readLine()!!.toInt()
    val total:Float=precio*cantidad
    println("El total a pagar es $total")
}