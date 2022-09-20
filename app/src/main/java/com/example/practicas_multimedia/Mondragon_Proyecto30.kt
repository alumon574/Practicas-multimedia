package com.example.practicas_multimedia

fun main() {
    println("3 numeros:")
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    val n3 = readLine()!!.toInt()

    val mayor = if (n1>n2 && n1>3)n1 else if (n2>n1 && n2>n3)n2 else n3
    val menor = if (n1<n2 && n1<n3)n1 else if (n2<n1 && n2<n3)n2 else n3

    println("El mayor es $mayor y el menor es $menor")
}