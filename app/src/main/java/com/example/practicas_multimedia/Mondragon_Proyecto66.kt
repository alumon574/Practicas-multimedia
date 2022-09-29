package com.example.practicas_multimedia.ui.theme

fun main() {
    println("Escribe un numero entre 1 y 5")
    val num = readLine()!!.toInt()
    when (num) {
        1 -> println("Uno")
        2 -> println("Dos")
        3 -> println("Tres")
        4 -> println("Cuatro")
        5 -> println("Cinco")
        else -> println("Numero no valido")
    }
}