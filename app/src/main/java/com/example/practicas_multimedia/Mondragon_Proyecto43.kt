package com.example.practicas_multimedia

fun main() {
    var cantidad = 0
    var suma = 0
    do {
        println("Escribe un numero")
        var numero = readLine()!!.toInt()
        suma += numero
        cantidad++
    }while (numero!=0)
    cantidad--
    val media = suma/cantidad
    println("La media es $media")
}