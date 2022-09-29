package com.example.practicas_multimedia

fun main() {
    var suma = 0
    do {
        println("Escribe un numero")
        var num = readLine()!!.toInt()
        if (num!=9999)
        suma += num
    } while (num != 9999)
    println(suma)
    if (suma < 0) println("Negativo")
    if (suma == 0) println("Igual a 0")
    if (suma > 0) println("Positivo")

}