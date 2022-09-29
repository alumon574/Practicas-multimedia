package com.example.practicas_multimedia

fun menor73(){
    println("Escribe 3 numeros para ver su menor:")
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    val n3 = readLine()!!.toInt()

    when{
        n1<n2 && n1<n3 -> println(n1)
        n2<n1 && n2<n3 -> println(n2)
        else -> println(n3)
    }
}

fun main() {
    menor73()
    menor73()
}