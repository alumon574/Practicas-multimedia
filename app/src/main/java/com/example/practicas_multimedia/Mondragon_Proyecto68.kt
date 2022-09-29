package com.example.practicas_multimedia

fun main() {
    var cantidad0 = 0
    var cantidad1 = 0
    var cantidad5 = 0
    var cantidad10 = 0
    for (i in 1..10) {
        println("Escribe un numero entero")
        var numero = readLine()!!.toInt()
        when (numero) {
            0 -> cantidad0++
            1 -> cantidad1++
            5 -> cantidad5++
            10 -> cantidad10++
        }
    }
    println("El 0 ha salido $cantidad0 veces")
    println("El 1 ha salido $cantidad1 veces")
    println("El 5 ha salido $cantidad5 veces")
    println("El 10 ha salido $cantidad10 veces")
}