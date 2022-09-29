package com.example.practicas_multimedia

fun main() {
    println("Escribe numero entre 1 y 999")
    val num = readLine()!!.toInt()
    val digitos = if (num in 1..9)1 else if (num in 10..99)2 else if (num in 100..999)3 else 0
    if (digitos==0)
        println("El numero introducido no es correcto")
    else println("El numero tiene $digitos digitos")
}