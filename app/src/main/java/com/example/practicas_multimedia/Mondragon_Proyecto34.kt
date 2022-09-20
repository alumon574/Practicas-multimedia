package com.example.practicas_multimedia

fun main() {
    println("Introduce la cantidad de barras")
    val numBarras = readLine()!!.toInt()
    var contador = 1
    var numValidas = 0
    while (contador <= numBarras) {
        println("Introduce medida, si mide entre 1.20 y 1.30 se guardara")
        var medidaBarra = readLine()!!.toFloat()
        if (medidaBarra in 1.20..1.30)
            numValidas++
        contador++
    }
    println("Hay $numValidas barras con la medida correcta")
}