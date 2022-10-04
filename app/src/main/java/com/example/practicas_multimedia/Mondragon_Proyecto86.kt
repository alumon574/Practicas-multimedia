package com.example.practicas_multimedia

fun main() {
    println("Escribe primer numero:")
    val n1= readLine()!!.toInt()
    println("Escribe segundo numero:")
    val n2 = readLine()!!.toInt()
   println("El mayor de ambos es: ${mayor86(n1,n2)}")
}

fun mayor86(n1:Int,n2:Int) = if (n1>n2)n1 else n2