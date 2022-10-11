package com.example.practicas_multimedia

fun main() {
    val sueldos:IntArray
    sueldos = IntArray(5)
    for (i in 0..4){
        println("Escribe sueldo:")
        sueldos[i] = readLine()!!.toInt()
    }
    for (i in 0..4)
        println(sueldos[i])
}