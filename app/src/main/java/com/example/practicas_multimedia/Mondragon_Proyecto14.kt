package com.example.practicas_multimedia

fun main() {
    println("Escribe un numero entre 1 y 99")
    val numero = readLine()!!.toInt()
    if (numero<1 || numero>99)
        println("Numero no valido")
    if (numero in 1..9)
        println("Tiene un digito")
    if (numero in 10..99)
        println("Tiene 2 digitos")
}