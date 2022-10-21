package com.example.practicas_multimedia

class Triangulo113(var lado1: Int, var lado2: Int, var lado3: Int){

    fun ladoMayor(){
        println("Lado mayor")
        when{
            lado1 > lado2 && lado1>lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
    }

    fun esEquilatero(){
        if (lado1==lado2 && lado1==lado3)
            println("El triangulo es equilatero.")
        else
            println("El triangulo no es equilatero.")
    }
}

fun main() {
    val t1 = Triangulo113(1,2,5)
    t1.ladoMayor()
    t1.esEquilatero()
}