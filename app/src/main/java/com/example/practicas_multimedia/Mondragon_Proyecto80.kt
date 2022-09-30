package com.example.practicas_multimedia

fun verMayor80(n1:Int,n2:Int):Int{
    return if (n1>n2)
        return n1
    else if (n2>n1)
        n2
    else {
        println("Son iguales")
        0
    }
    }

fun main() {
    println("Escribe primer numero")
    val n1 = readLine()!!.toInt()
    println("Escribe segundo numero")
    val n2 = readLine()!!.toInt()
    println("El mayor de los 2 es ${verMayor80(n1,n2)}")
}