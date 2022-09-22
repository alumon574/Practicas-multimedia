package com.example.practicas_multimedia

fun main() {

    var x = 0
    var suma1 = 0
    var suma2 = 0
    println("Escribe 5 numeros:")
    while (x < 5) {
        var n1 = readLine()!!.toInt()
        suma1 = suma1 + n1
        x++
    }
    x = 0
    println("Escribe 5 mas")
    while (x < 5) {
        var n2 = readLine()!!.toInt()
        suma2 = suma2 + n2
        x++
    }
    val mayor = if (suma1>suma2)suma1 else suma2
    println("La lista 1 da $suma1, la lista 2 da $suma2," +
            " por tanto la mayor es $mayor")
}