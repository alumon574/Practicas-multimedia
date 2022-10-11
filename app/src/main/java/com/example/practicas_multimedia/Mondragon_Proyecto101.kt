package com.example.practicas_multimedia

fun main() {
    val array = IntArray(10)
    for (i in array.indices){
        println("Escribe un entero")
        array[i] = readLine()!!.toInt()
    }
    println("Primer numero del array = ${array[0]}")
    println("Ultimo numero del array = ${array[array.lastIndex]}")
}