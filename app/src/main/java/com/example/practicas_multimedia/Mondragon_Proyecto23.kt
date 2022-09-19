package com.example.practicas_multimedia

fun main() {
    println("3 numeros")
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    val num3 = readLine()!!.toInt()
    if (num1 > num2 && num1>num3) println(num1)
    else if (num2>num3) println(num2)
    else println(num3)
}