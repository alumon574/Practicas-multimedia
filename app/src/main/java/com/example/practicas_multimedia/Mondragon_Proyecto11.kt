package com.example.practicas_multimedia

fun main() {
    println("Primer numero:")
    val num1 = readLine()!!.toInt()
    println("Segundo numero")
    val num2 = readLine()!!.toInt()
    if (num1==num2) println("Los numeros deben ser diferentes")
    else if (num1>num2)
        println("El numero mayor es $num1")
    else
        println("El numero mayor es $num2")
}