package com.example.practicas_multimedia

fun main() {

    println("Escribe 3 numeros:")
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    val n3 = readLine()!!.toInt()

    if (n1<10 && n2 <10 && n3<10)
        println("Todos los numeros son menores a 10")
}