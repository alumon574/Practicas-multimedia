package com.example.practicas_multimedia

fun main() {
    subtitular92("Sistema de administracion")
    subtitular92("Ventas","-")
}

fun subtitular92(frase:String,caracter:String="*"){
    println(frase)
    for (i in 1..frase.length)
        print(caracter)
    println()
}