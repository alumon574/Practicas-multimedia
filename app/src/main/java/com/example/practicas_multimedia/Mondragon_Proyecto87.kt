package com.example.practicas_multimedia

fun main() {
    println("Escribe un numero")
    val n = readLine()!!.toInt()
    println(pasarLetra87(n))
}

fun pasarLetra87(n: Int) = when (n) {
    1 -> "Uno"
    2 -> "Dos"
    3 -> "Tres"
    4 -> "Cuatro"
    5 -> "Cinco"
    else -> "Error"
}