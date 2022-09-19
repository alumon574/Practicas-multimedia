package com.example.practicas_multimedia

fun main() {
    println("Escribe 3 numeros:")
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    val n3 = readLine()!!.toInt()
    val media = (n1+n2+n3)/3
    var nota = if (media<4)"reprobado" else if (media>=4&&media<7)"Regular" else "Promocionado"
    println("La media es $media, por tanto $nota")
}