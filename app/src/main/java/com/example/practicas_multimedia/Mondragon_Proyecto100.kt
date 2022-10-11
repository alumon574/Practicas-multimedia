package com.example.practicas_multimedia

fun main() {
    val array = IntArray(10)
    for (i in 0..array.size-1){
        println("Escribe un numero:")
        array[i] = readLine()!!.toInt()
    }
    var ordenado = true
    for (i in 0..array.size-2)
        if (array[i+1]<array[i])
            ordenado=false
    if (ordenado)
        println("Estan ordenados de menor a mayor")
    else
        println("No estan ordenados de menor a mayor")
}