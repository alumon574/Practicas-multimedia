package com.example.practicas_multimedia

fun main() {
    val alturas = FloatArray(5)
    var suma = 0f
    for (i in 0..alturas.size-1){
        println("Escribe una altura:")
        alturas[i] = readLine()!!.toFloat()
        suma+=alturas[i]
    }
    val media = suma/alturas.size
    println("Altura media  = $media")
    var altos = 0
    var bajos = 0
    for (i in 0..alturas.size-1){
        if (alturas[i]>media)
            altos++
        else
            bajos++
    }
    println("Cantidad de altos = $altos\n" +
            "Cantidad de bajos = $bajos")
}