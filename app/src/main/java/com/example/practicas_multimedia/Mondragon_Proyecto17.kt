package com.example.practicas_multimedia

fun main() {
    println("Escribe un numero entre 1 y 99")
    val num1 = readLine()!!.toInt()
    val numDigitos = if (num1<10)1 else 2
    println("El numero $num1 tiene $numDigitos digitos")
}