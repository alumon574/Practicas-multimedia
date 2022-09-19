package com.example.practicas_multimedia

fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()
    val num4 = readLine()!!.toInt()

    val suma = num1+num2+num3+num4
    val promedio = suma/4

    println("La suma es $suma y el promedio es $promedio")
}