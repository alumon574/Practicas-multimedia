package com.example.practicas_multimedia

fun main() {
    var sumaNota=0
    for (i in 1..3){
        println("Escribe nota:")
        var nota = readLine()!!.toInt()
        sumaNota +=nota
    }
    val media = sumaNota/3
    println("Media = $media")
    when{
        media>=7 -> println("Promocionado")
        media in 4..6 -> println("Regular")
        media<4 -> println("Reprobado")
    }
}