package com.example.practicas_multimedia

fun main() {

    println("Introduce una coordenada x:")
    val x = readLine()!!.toInt()
    println("Introduce una cordenada y:")
    val y = readLine()!!.toInt()
    val cuadrante = if (x>0 && y>0)"Primer cuadrante" else if (x<0 && y>0)"Segundo cuadrante" else "Ni primer ni segundo cuadrante"
    println(cuadrante)
}