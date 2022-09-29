package com.example.practicas_multimedia

fun main() {
    println("Introduce el numero de preguntas:")
    val numPreguntas = readLine()!!.toInt()
    println("numero de aciertos")
    val numAciertos = readLine()!!.toInt()
    val porcentajeAciertos = numAciertos*100/numPreguntas
    val Nivel = if (porcentajeAciertos < 50)"Fuera de nivel" else if (porcentajeAciertos in 50..74)"Nivel regular" else if (porcentajeAciertos in 75..89)"Nivel medio" else "Nivel maximo"
    println("Ha acertado un $porcentajeAciertos% por lo que su nivel es:$Nivel")
}