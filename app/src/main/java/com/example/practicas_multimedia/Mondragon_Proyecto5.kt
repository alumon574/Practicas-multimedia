package com.example.practicas_multimedia.ui.theme

fun main() {
    println("Escribe el primer numero:")
    var num1:Int= readLine()!!.toInt()
    println("Escribe el segundo numero:")
    val num2:Int= readLine()!!.toInt()
    val suma = num2+num1
    val producto = num1*num2
    println("La suma de $num1 y $num2 es $suma y su producto es $producto")
}