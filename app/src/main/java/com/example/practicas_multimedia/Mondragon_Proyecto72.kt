package com.example.practicas_multimedia

fun cuadrado72(){
    println("Escribe numero para calcular su cuadrado")
    val num1 = readLine()!!.toInt()
    val cuadrado = num1*num1
    println("El cuadrado de $num1 es $cuadrado")
}

fun multiplicar72(){
    println("Escribe primer multiplo")
    val num1 = readLine()!!.toInt()
    println("Escribe segundo mutliplo")
    val num2 = readLine()!!.toInt()
    val multiplicacion = num1*num2
    println("El resultado de multiplicar $num1 por $num2 es $multiplicacion")
}

fun main() {
    cuadrado72()
    multiplicar72()
}