package com.example.practicas_multimedia

fun main() {
    println("Numero 1:")
    val num1 = readLine()!!.toInt()
    println("numero 2:")
    val num2 = readLine()!!.toInt()

    val suma = num1+num2
    val resta = num1-num2
    val producto = num1*num2
    val division = num1/num2
    if (num1<num2)
        println("suma: $suma, resta: $resta")
    else
        println("producto: $producto, division: $division")
}