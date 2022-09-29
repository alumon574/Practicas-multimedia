package com.example.practicas_multimedia

fun main() {
    println("3 numeros")
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()
    if (num1 == num2 && num1 == num3)
        println("El cubo de $num1 es "+num1*num1*num1)
}