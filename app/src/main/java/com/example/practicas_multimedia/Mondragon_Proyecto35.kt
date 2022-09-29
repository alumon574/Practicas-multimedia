package com.example.practicas_multimedia

fun main() {
    var contador = 1
    var menosDe7 = 0
    var igual7 = 0
    var mayor7 = 0
    while (contador <= 10) {
        println("Introduce nota")
        var nota = readLine()!!.toInt()
        if (nota < 7)
            menosDe7++
        if (nota == 7)
            igual7++
        if (nota > 7)
            mayor7++
        contador++
    }
    println("Hay $menosDe7 notas menores a 7")
    println("Hay $igual7 notas iguales a 7")
    println("Hay $mayor7 notas iguales a 7")
}