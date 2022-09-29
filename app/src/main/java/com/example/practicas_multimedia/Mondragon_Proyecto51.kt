package com.example.practicas_multimedia

fun main() {
    var pares = 0
    println("Cuantos numeros:")
    val cantidadNums = readLine()!!.toInt()
    for (i in 1..cantidadNums){
        println("Escribe numero para comprobar si es par:")
        var numero = readLine()!!.toInt()
        if (numero%2==0)
            pares++
    }
    println("Hay $pares numeros pares")

}