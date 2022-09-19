package com.example.practicas_multimedia

fun main() {
    println("Introduce un dia del mes")
    val dia = readLine()!!.toInt()
    println("mes")
    val mes = readLine()!!.toInt()
    println("año")
    val year = readLine()!!.toInt()

    if (mes==1||mes==2||year==3)
        println("Primer trimestre del año")
}