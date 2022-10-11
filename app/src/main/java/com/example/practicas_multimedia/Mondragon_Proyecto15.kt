package com.example.practicas_multimedia

fun main() {
    println("Escribe un numero:")
    val num1 = readLine()!!.toInt()
    println("Escribe otro numero:")
    val num2 = readLine()!!.toInt()

    if (num1==num2)
        println("Son iguales")


    var mayor = if (num1>num2) num1 else num2
    println(mayor)
}