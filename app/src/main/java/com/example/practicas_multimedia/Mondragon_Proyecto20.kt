package com.example.practicas_multimedia

fun main() {
    println("Escribe 1 numero")
    val num = readLine()!!.toInt()
    if (num==0)
        println("El numero es 0")
    if (num>0)
        println("Es positivo")
    if (num<0)
        println("Es negativo")
}