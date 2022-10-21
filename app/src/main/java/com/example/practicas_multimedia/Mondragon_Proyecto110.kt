package com.example.practicas_multimedia

class Triangulo110{
    var lado1=0
    var lado2=0
    var lado3=0

    fun crear110(){
        println("Escribe lado 1:")
        lado1= readLine()!!.toInt()
        println("Escribe lado 2:")
        lado2= readLine()!!.toInt()
        println("Escribe lado 3:")
        lado3= readLine()!!.toInt()
    }

    fun ladoMayor110(){
        println("Lado mayor: ")
        when{
            lado1>lado2 && lado1>lado3 -> println(lado1)
            lado2>lado3 -> println(lado2)
            else -> println(lado3)
        }
    }

    fun esEquilatero(){
        if (lado1==lado2 && lado1==lado3)
            println("Es equilatero")
        else
            println("No es equilatero")
    }
}

fun main() {
    val t1 = Triangulo110()
    t1.crear110()
    t1.ladoMayor110()
    t1.esEquilatero()
}