package com.example.practicas_multimedia

fun inicio74(mensaje:String){
    println("-------------------")
    println(mensaje)
    println("-------------------")
}

fun sumar74(){
    println("Escribe primer numero")
    val n1 = readLine()!!.toInt()
    println("Escribe segundo numero")
    val n2 = readLine()!!.toInt()
    val suma = n1+n2
    println("La suma da $suma")
}

fun main() {
    inicio74("El programa suma 2 numeros")
    sumar74()
    inicio74("Final")
}