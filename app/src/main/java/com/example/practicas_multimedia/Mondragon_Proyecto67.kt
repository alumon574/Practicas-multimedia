package com.example.practicas_multimedia

fun main() {
    println("Escribe numero entre 1 y 99999")
    val num = readLine()!!.toInt()
    val string = num.toString()
    when (string.length) {
        1 -> println("1 Digito")
        2 -> println("2 Digitos")
        3 -> println("3 Digitos")
        4 -> println("4 Digitos")
        5 -> println("5 Digitos")
        else -> println("Numero no valido")
    }
}