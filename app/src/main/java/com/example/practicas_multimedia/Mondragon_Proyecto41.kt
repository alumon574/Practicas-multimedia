package com.example.practicas_multimedia

fun main() {
    var Pares = 0
    var Impares = 0
    var contador = 0
    println("Escribe cantidad numeros:")
    val cantidadNumeros = readLine()!!.toInt()
    while (contador<cantidadNumeros) {
        var numero = readLine()!!.toInt()
        if (numero % 2 == 0)
            Pares++
        else Impares++
        contador++
    }

        println("Hay $Pares numeros pares, y $Impares impares.")
    }
