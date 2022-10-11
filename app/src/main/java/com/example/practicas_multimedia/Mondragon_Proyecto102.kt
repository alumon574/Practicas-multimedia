package com.example.practicas_multimedia

fun main() {
    val array = IntArray(5)
    for (i in array.indices){
        println("Escribe un entero")
        array[i] = readLine()!!.toInt()
    }
    for (i in array)
        println(i)
}