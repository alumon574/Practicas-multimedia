package com.example.practicas_multimedia

fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()
    val num4 = readLine()!!.toInt()

    val suma = num1+num2
    val producto = num3*num4
    println("La suma de $num1 y $num2 es $suma")
    println("El producto de $num3 y $num4 es $producto")
}