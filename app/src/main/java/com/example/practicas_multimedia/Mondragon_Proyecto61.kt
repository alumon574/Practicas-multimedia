package com.example.practicas_multimedia

fun main() {
    var mayor = 0
    var entre = 0
    var menor = 0
    var piezas = 0
    do {
        println("Escribe peso de la pieza en Kg (0.0 Para terminar):")
        var peso = readLine()!!.toDouble()
        if (peso!=0.0){
            when{
                peso< 9.8 -> menor++
                peso in 9.8..10.2 -> entre++
                peso>10.2 -> mayor++
            }
            piezas++
        }
    }while (peso != 0.0)
    println("Piezas con peso menor a 9.8 = $menor\n" +
            "Piezas con peso entre 9.8 y 10.2 = $entre\n" +
            "Piezas con peso mayor a 10.2 = $mayor\n" +
            "Numero total de piezas = $piezas")
}