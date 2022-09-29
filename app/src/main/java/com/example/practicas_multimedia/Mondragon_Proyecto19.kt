package com.example.practicas_multimedia

fun main() {
    println("Escribe 3 numero")
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    val n3 = readLine()!!.toInt()
    if (n1>n2&&n1>n3)
        println(n1)
    if (n2>n1&&n2>n3)
        println(n2)
    if (n3>n1&&n3>n2)
        println(n3)
}